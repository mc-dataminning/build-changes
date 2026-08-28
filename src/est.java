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

public class est extends ert {
   private static final Codec<List<est.b>> b = est.b.a.listOf().validate($$0 -> {
      Set<ji<brz>> $$1 = new ObjectOpenHashSet();

      for (est.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, est::new)
   );
   private final List<est.b> c;

   est(List<etr> $$0, List<est.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public erv<est> b() {
      return erw.r;
   }

   @Override
   public Set<eta<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.a(cur.vU) && !this.c.isEmpty()) {
         est.b $$2 = ac.a(this.c, $$1.b());
         ji<brz> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxs.a $$5 = new cxs.a($$3, $$4);
         $$0.a(km.H, cxs.a, $$5, cxs::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static est.a c() {
      return new est.a();
   }

   public static class a extends ert.a<est.a> {
      private final Builder<est.b> a = ImmutableList.builder();

      protected est.a a() {
         return this;
      }

      public est.a a(ji<brz> $$0, eum $$1) {
         this.a.add(new est.b($$0, $$1));
         return this;
      }

      @Override
      public eru b() {
         return new est(this.g(), this.a.build());
      }
   }

   static record b(ji<brz> b, eum c) {
      public static final Codec<est.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(est.b::a), eun.a.fieldOf("duration").forGetter(est.b::b)).apply($$0, est.b::new)
      );

      public ji<brz> a() {
         return this.b;
      }

      public eum b() {
         return this.c;
      }
   }
}
