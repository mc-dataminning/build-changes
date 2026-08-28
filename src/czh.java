import com.mojang.serialization.Codec;

public record czh(cwb c) {
   public static final Codec<czh> a = cwb.b.xmap(czh::new, czh::a);
   public static final zg<wt, czh> b = zg.a(cwb.i, czh::a, czh::new);

   public cwb a(bva $$0, cwb $$1, int $$2) {
      boolean $$3 = $$0.fX();
      cwb $$4 = this.c.v();
      if ($$3) {
         return $$1;
      } else if ($$1.L() >= $$2) {
         return $$1;
      } else if ($$1.f()) {
         return $$4;
      } else {
         if (!$$0.dX().y_() && $$0 instanceof com $$5 && !$$5.gk().f($$4)) {
            $$5.a($$4, false);
         }

         return $$1;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         czh $$1 = (czh)$$0;
         return cwb.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwb.a(this.c);
   }

   public cwb a() {
      return this.c;
   }
}
