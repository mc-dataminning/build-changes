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

public class eyc extends exd {
   private static final Codec<List<eyc.b>> b = eyc.b.a.listOf().validate($$0 -> {
      Set<jr<btn>> $$1 = new ObjectOpenHashSet();

      for (eyc.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eyc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eyc::new)
   );
   private final List<eyc.b> c;

   eyc(List<eyz> $$0, List<eyc.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exf<eyc> b() {
      return exg.r;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.a(cws.wW) && !this.c.isEmpty()) {
         eyc.b $$2 = af.a(this.c, $$1.b());
         jr<btn> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czp.a $$5 = new czp.a($$3, $$4);
         $$0.a(kv.R, czp.a, $$5, czp::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eyc.a c() {
      return new eyc.a();
   }

   public static class a extends exd.a<eyc.a> {
      private final Builder<eyc.b> a = ImmutableList.builder();

      protected eyc.a a() {
         return this;
      }

      public eyc.a a(jr<btn> $$0, ezv $$1) {
         this.a.add(new eyc.b($$0, $$1));
         return this;
      }

      @Override
      public exe b() {
         return new eyc(this.g(), this.a.build());
      }
   }

   static record b(jr<btn> b, ezv c) {
      public static final Codec<eyc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btn.a.fieldOf("type").forGetter(eyc.b::a), ezw.a.fieldOf("duration").forGetter(eyc.b::b)).apply($$0, eyc.b::new)
      );

      public jr<btn> a() {
         return this.b;
      }

      public ezv b() {
         return this.c;
      }
   }
}
