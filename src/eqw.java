import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqw extends eqs {
   public static final int a = 0;
   public static final MapCodec<eqw> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etj.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, eqw::new)
   );
   private final eti c;
   private final int d;

   eqw(List<esn> $$0, eti $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public equ b() {
      return eqv.l;
   }

   @Override
   public Set<erw<?>> a() {
      return Sets.union(ImmutableSet.of(erz.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      brw $$2 = $$1.c(erz.d);
      if ($$2 instanceof bsq) {
         int $$3 = czc.h((bsq)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.I() > this.d) {
            $$0.e(this.d);
         }
      }

      return $$0;
   }

   public static eqw.a a(eti $$0) {
      return new eqw.a($$0);
   }

   public static class a extends eqs.a<eqw.a> {
      private final eti a;
      private int b = 0;

      public a(eti $$0) {
         this.a = $$0;
      }

      protected eqw.a a() {
         return this;
      }

      public eqw.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eqt b() {
         return new eqw(this.g(), this.a, this.b);
      }
   }
}
