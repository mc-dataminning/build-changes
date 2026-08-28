import java.util.List;

public class cng extends cne {
   public static final float g = 4.0F;

   public cng(bta<? extends cng> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cng(dby $$0, btp $$1, double $$2, double $$3, double $$4) {
      super(bta.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      if ($$0.c() != evp.a.c || !this.e(((evo)$$0).a())) {
         if (!this.dP().B) {
            List<btp> $$1 = this.dP().a(btp.class, this.cK().c(4.0, 2.0, 4.0));
            bsq $$2 = new bsq(this.dP(), this.du(), this.dw(), this.dA());
            bsu $$3 = this.s();
            if ($$3 instanceof btp) {
               $$2.a((btp)$$3);
            }

            $$2.a(li.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bsc(bse.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btp $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.du(), $$4.dw(), $$4.dA());
                     break;
                  }
               }
            }

            this.dP().c(2006, this.dp(), this.aW() ? -1 : 1);
            this.dP().b($$2);
            this.ao();
         }
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      return false;
   }

   @Override
   protected lg v() {
      return li.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
