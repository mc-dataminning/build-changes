import java.util.List;

public class ccj extends cch {
   public static final float e = 4.0F;

   public ccj(bja<? extends ccj> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccj(cqb $$0, bjm $$1, double $$2, double $$3, double $$4) {
      super(bja.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if ($$0.c() != ehf.a.c || !this.d(((ehe)$$0).a())) {
         if (!this.dL().B) {
            List<bjm> $$1 = this.dL().a(bjm.class, this.cG().c(4.0, 2.0, 4.0));
            bit $$2 = new bit(this.dL(), this.dq(), this.ds(), this.dw());
            biw $$3 = this.v();
            if ($$3 instanceof bjm) {
               $$2.a((bjm)$$3);
            }

            $$2.a(iv.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bij(bil.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bjm $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.e($$4.dq(), $$4.ds(), $$4.dw());
                     break;
                  }
               }
            }

            this.dL().c(2006, this.dl(), this.aS() ? -1 : 1);
            this.dL().b($$2);
            this.ak();
         }
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      return false;
   }

   @Override
   protected it s() {
      return iv.i;
   }

   @Override
   protected boolean ae_() {
      return false;
   }
}
