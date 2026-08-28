import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ert extends erp {
   public static final int a = 0;
   public static final MapCodec<ert> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euj.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, ert::new)
   );
   private final eui c;
   private final int d;

   ert(List<etn> $$0, eui $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public err<ert> b() {
      return ers.m;
   }

   @Override
   public Set<esw<?>> a() {
      return Sets.union(ImmutableSet.of(esz.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      bsp $$2 = $$1.c(esz.d);
      if ($$2 instanceof btk) {
         int $$3 = czw.h((btk)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c()) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static ert.a a(eui $$0) {
      return new ert.a($$0);
   }

   public static class a extends erp.a<ert.a> {
      private final eui a;
      private int b = 0;

      public a(eui $$0) {
         this.a = $$0;
      }

      protected ert.a a() {
         return this;
      }

      public ert.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public erq b() {
         return new ert(this.g(), this.a, this.b);
      }
   }
}
