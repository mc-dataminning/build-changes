import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erz extends erv {
   public static final int a = 0;
   public static final MapCodec<erz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eup.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, erz::new)
   );
   private final euo c;
   private final int d;

   erz(List<ett> $$0, euo $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public erx<erz> b() {
      return ery.m;
   }

   @Override
   public Set<etc<?>> a() {
      return Sets.union(ImmutableSet.of(etf.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      bsv $$2 = $$1.c(etf.d);
      if ($$2 instanceof btq) {
         int $$3 = dac.h((btq)$$2);
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

   public static erz.a a(euo $$0) {
      return new erz.a($$0);
   }

   public static class a extends erv.a<erz.a> {
      private final euo a;
      private int b = 0;

      public a(euo $$0) {
         this.a = $$0;
      }

      protected erz.a a() {
         return this;
      }

      public erz.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public erw b() {
         return new erz(this.g(), this.a, this.b);
      }
   }
}
