import com.mojang.serialization.Codec;

public record cyz(cvp c) {
   public static final Codec<cyz> a = cvp.b.xmap(cyz::new, cyz::a);
   public static final zb<wo, cyz> b = zb.a(cvp.i, cyz::a, cyz::new);

   public cvp a(buk $$0, cvp $$1, int $$2) {
      boolean $$3 = $$0.fQ();
      cvp $$4 = this.c.u();
      if ($$3) {
         return $$1;
      } else if ($$1.J() >= $$2) {
         return $$1;
      } else if ($$1.f()) {
         return $$4;
      } else {
         if (!$$0.dS().w_() && $$0 instanceof cnu $$5 && !$$5.gc().f($$4)) {
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
         cyz $$1 = (cyz)$$0;
         return cvp.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cvp.a(this.c);
   }

   public cvp a() {
      return this.c;
   }
}
