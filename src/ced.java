import java.util.List;

public class ced extends ceb {
   public static final float e = 4.0F;

   public ced(bku<? extends ced> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ced(csa $$0, blg $$1, double $$2, double $$3, double $$4) {
      super(bku.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if ($$0.c() != ejs.a.c || !this.d(((ejr)$$0).a())) {
         if (!this.dN().B) {
            List<blg> $$1 = this.dN().a(blg.class, this.cH().c(4.0, 2.0, 4.0));
            bkn $$2 = new bkn(this.dN(), this.ds(), this.du(), this.dy());
            bkq $$3 = this.w();
            if ($$3 instanceof blg) {
               $$2.a((blg)$$3);
            }

            $$2.a(js.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bkd(bkf.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (blg $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.ds(), $$4.du(), $$4.dy());
                     break;
                  }
               }
            }

            this.dN().c(2006, this.dn(), this.aU() ? -1 : 1);
            this.dN().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return false;
   }

   @Override
   protected jq s() {
      return js.i;
   }

   @Override
   protected boolean af_() {
      return false;
   }
}
