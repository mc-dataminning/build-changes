import com.mojang.serialization.Codec;

public record czb(cvx c) {
   public static final Codec<czb> a = cvx.b.xmap(czb::new, czb::a);
   public static final zf<ws, czb> b = zf.a(cvx.i, czb::a, czb::new);

   public cvx a(buv $$0, cvx $$1, int $$2) {
      boolean $$3 = $$0.fX();
      cvx $$4 = this.c.v();
      if ($$3) {
         return $$1;
      } else if ($$1.L() >= $$2) {
         return $$1;
      } else if ($$1.f()) {
         return $$4;
      } else {
         if (!$$0.dX().y_() && $$0 instanceof coh $$5 && !$$5.gk().f($$4)) {
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
         czb $$1 = (czb)$$0;
         return cvx.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvx.a(this.c);
   }

   public cvx a() {
      return this.c;
   }
}
