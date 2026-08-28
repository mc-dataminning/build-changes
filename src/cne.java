import java.util.List;

public class cne extends cnc {
   public static final float e = 4.0F;

   public cne(bsw<? extends cne> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cne(dcu $$0, btl $$1, eww $$2) {
      super(bsw.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if ($$0.c() != ewu.a.c || !this.e(((ewt)$$0).a())) {
         if (!this.dQ().B) {
            List<btl> $$1 = this.dQ().a(btl.class, this.cL().c(4.0, 2.0, 4.0));
            bsm $$2 = new bsm(this.dQ(), this.dv(), this.dx(), this.dB());
            bsq $$3 = this.s();
            if ($$3 instanceof btl) {
               $$2.a((btl)$$3);
            }

            $$2.a(lm.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bry(bsa.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btl $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dv(), $$4.dx(), $$4.dB());
                     break;
                  }
               }
            }

            this.dQ().c(2006, this.dq(), this.aX() ? -1 : 1);
            this.dQ().b($$2);
            this.aq();
         }
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return false;
   }

   @Override
   protected lk v() {
      return lm.h;
   }

   @Override
   protected boolean t() {
      return false;
   }
}
