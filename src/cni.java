import java.util.List;

public class cni extends cng {
   public static final float g = 4.0F;

   public cni(btc<? extends cni> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cni(dca $$0, btr $$1, double $$2, double $$3, double $$4) {
      super(btc.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evr $$0) {
      super.a($$0);
      if ($$0.c() != evr.a.c || !this.e(((evq)$$0).a())) {
         if (!this.dP().B) {
            List<btr> $$1 = this.dP().a(btr.class, this.cK().c(4.0, 2.0, 4.0));
            bss $$2 = new bss(this.dP(), this.du(), this.dw(), this.dA());
            bsw $$3 = this.s();
            if ($$3 instanceof btr) {
               $$2.a((btr)$$3);
            }

            $$2.a(li.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new bse(bsg.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btr $$4 : $$1) {
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
   public boolean a(brp $$0, float $$1) {
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
