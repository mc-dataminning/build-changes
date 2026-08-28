import java.util.List;

public class cmu extends cms {
   public static final float e = 4.0F;

   public cmu(bsn<? extends cmu> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmu(dcg $$0, btc $$1, ewh $$2) {
      super(bsn.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if ($$0.c() != ewf.a.c || !this.e(((ewe)$$0).a())) {
         if (!this.dR().B) {
            List<btc> $$1 = this.dR().a(btc.class, this.cM().c(4.0, 2.0, 4.0));
            bsd $$2 = new bsd(this.dR(), this.dw(), this.dy(), this.dC());
            bsh $$3 = this.s();
            if ($$3 instanceof btc) {
               $$2.a((btc)$$3);
            }

            $$2.a(lj.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new brp(brr.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btc $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dw(), $$4.dy(), $$4.dC());
                     break;
                  }
               }
            }

            this.dR().c(2006, this.dr(), this.aY() ? -1 : 1);
            this.dR().b($$2);
            this.aq();
         }
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return false;
   }

   @Override
   protected lh v() {
      return lj.h;
   }

   @Override
   protected boolean t() {
      return false;
   }
}
