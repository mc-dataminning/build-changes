import java.util.List;

public class chu extends chs {
   public static final float e = 4.0F;

   public chu(bnw<? extends chu> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public chu(cvr $$0, boi $$1, double $$2, double $$3, double $$4) {
      super(bnw.z, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if ($$0.c() != enx.a.c || !this.d(((enw)$$0).a())) {
         if (!this.dM().B) {
            List<boi> $$1 = this.dM().a(boi.class, this.cH().c(4.0, 2.0, 4.0));
            bnn $$2 = new bnn(this.dM(), this.dr(), this.dt(), this.dx());
            bnq $$3 = this.w();
            if ($$3 instanceof boi) {
               $$2.a((boi)$$3);
            }

            $$2.a(jz.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bnd(bnf.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (boi $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dr(), $$4.dt(), $$4.dx());
                     break;
                  }
               }
            }

            this.dM().c(2006, this.dm(), this.aU() ? -1 : 1);
            this.dM().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      return false;
   }

   @Override
   protected jx u() {
      return jz.i;
   }

   @Override
   protected boolean s() {
      return false;
   }
}
