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

public class esw extends erw {
   private static final Codec<List<esw.b>> b = esw.b.a.listOf().validate($$0 -> {
      Set<ji<bsc>> $$1 = new ObjectOpenHashSet();

      for (esw.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, esw::new)
   );
   private final List<esw.b> c;

   esw(List<etu> $$0, List<esw.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ery<esw> b() {
      return erz.r;
   }

   @Override
   public Set<etd<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$0.a(cuu.vU) && !this.c.isEmpty()) {
         esw.b $$2 = ac.a(this.c, $$1.b());
         ji<bsc> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxv.a $$5 = new cxv.a($$3, $$4);
         $$0.a(km.H, cxv.a, $$5, cxv::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static esw.a c() {
      return new esw.a();
   }

   public static class a extends erw.a<esw.a> {
      private final Builder<esw.b> a = ImmutableList.builder();

      protected esw.a a() {
         return this;
      }

      public esw.a a(ji<bsc> $$0, eup $$1) {
         this.a.add(new esw.b($$0, $$1));
         return this;
      }

      @Override
      public erx b() {
         return new esw(this.g(), this.a.build());
      }
   }

   static record b(ji<bsc> b, eup c) {
      public static final Codec<esw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(esw.b::a), euq.a.fieldOf("duration").forGetter(esw.b::b)).apply($$0, esw.b::new)
      );

      public ji<bsc> a() {
         return this.b;
      }

      public eup b() {
         return this.c;
      }
   }
}
