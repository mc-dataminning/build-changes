import java.util.List;

public class cox extends cov {
   public static final float e = 4.0F;

   public cox(bul<? extends cox> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cox(dfb $$0, bva $$1, ezn $$2) {
      super(bul.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if ($$0.d() != ezl.a.c || !this.e(((ezk)$$0).a())) {
         if (!this.dX().C) {
            List<bva> $$1 = this.dX().a(bva.class, this.cS().c(4.0, 2.0, 4.0));
            btx $$2 = new btx(this.dX(), this.dC(), this.dE(), this.dI());
            bue $$3 = this.s();
            if ($$3 instanceof bva) {
               $$2.a((bva)$$3);
            }

            $$2.a(lr.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new btj(btl.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bva $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dC(), $$4.dE(), $$4.dI());
                     break;
                  }
               }
            }

            this.dX().c(2006, this.dx(), this.bc() ? -1 : 1);
            this.dX().b($$2);
            this.av();
         }
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }

   @Override
   protected lp q() {
      return lr.h;
   }

   @Override
   protected boolean o() {
      return false;
   }
}
