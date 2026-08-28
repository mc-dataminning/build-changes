import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class etx extends esy {
   private static final Codec<List<etx.b>> b = etx.b.a.listOf().validate($$0 -> {
      Set<jm<brw>> $$1 = new ObjectOpenHashSet();

      for (etx.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, etx::new)
   );
   private final List<etx.b> c;

   etx(List<euw> $$0, List<etx.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eta<etx> b() {
      return etb.r;
   }

   @Override
   public Set<eue<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.a(cur.vX) && !this.c.isEmpty()) {
         etx.b $$2 = ad.a(this.c, $$1.b());
         jm<brw> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxu.a $$5 = new cxu.a($$3, $$4);
         $$0.a(kq.H, cxu.a, $$5, cxu::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static etx.a c() {
      return new etx.a();
   }

   public static class a extends esy.a<etx.a> {
      private final Builder<etx.b> a = ImmutableList.builder();

      protected etx.a a() {
         return this;
      }

      public etx.a a(jm<brw> $$0, evs $$1) {
         this.a.add(new etx.b($$0, $$1));
         return this;
      }

      @Override
      public esz b() {
         return new etx(this.g(), this.a.build());
      }
   }

   static record b(jm<brw> b, evs c) {
      public static final Codec<etx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brw.a.fieldOf("type").forGetter(etx.b::a), evt.a.fieldOf("duration").forGetter(etx.b::b)).apply($$0, etx.b::new)
      );

      public jm<brw> a() {
         return this.b;
      }

      public evs b() {
         return this.c;
      }
   }
}
