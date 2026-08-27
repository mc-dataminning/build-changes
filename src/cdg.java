import java.util.List;

public class cdg extends cde {
   public static final float e = 4.0F;

   public cdg(bjx<? extends cdg> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdg(cqz $$0, bkj $$1, double $$2, double $$3, double $$4) {
      super(bjx.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);
      if ($$0.c() != eid.a.c || !this.d(((eic)$$0).a())) {
         if (!this.dL().B) {
            List<bkj> $$1 = this.dL().a(bkj.class, this.cG().c(4.0, 2.0, 4.0));
            bjq $$2 = new bjq(this.dL(), this.dq(), this.ds(), this.dw());
            bjt $$3 = this.v();
            if ($$3 instanceof bkj) {
               $$2.a((bkj)$$3);
            }

            $$2.a(js.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bjg(bji.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bkj $$4 : $$1) {
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
   public boolean a(bir $$0, float $$1) {
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
