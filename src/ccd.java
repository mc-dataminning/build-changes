import java.util.List;

public class ccd extends ccb {
   public static final float e = 4.0F;

   public ccd(biu<? extends ccd> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccd(cpv $$0, bjg $$1, double $$2, double $$3, double $$4) {
      super(biu.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if ($$0.c() != ehl.a.c || !this.d(((ehk)$$0).a())) {
         if (!this.dL().B) {
            List<bjg> $$1 = this.dL().a(bjg.class, this.cH().c(4.0, 2.0, 4.0));
            bin $$2 = new bin(this.dL(), this.dq(), this.ds(), this.dw());
            biq $$3 = this.v();
            if ($$3 instanceof bjg) {
               $$2.a((bjg)$$3);
            }

            $$2.a(ix.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bid(bif.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bjg $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.e($$4.dq(), $$4.ds(), $$4.dw());
                     break;
                  }
               }
            }

            this.dL().c(2006, this.dl(), this.aT() ? -1 : 1);
            this.dL().b($$2);
            this.al();
         }
      }
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      return false;
   }

   @Override
   protected iv s() {
      return ix.i;
   }

   @Override
   protected boolean ae_() {
      return false;
   }
}
