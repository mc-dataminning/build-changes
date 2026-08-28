import java.util.List;

public class cqs extends cqq {
   public static final float d = 4.0F;

   public cqs(bwb<? extends cqs> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cqs(dhp $$0, bwr $$1, fcu $$2) {
      super(bwb.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if ($$0.d() != fcs.a.c || !this.e(((fcr)$$0).a())) {
         if (!this.dV().C) {
            List<bwr> $$1 = this.dV().a(bwr.class, this.cR().c(4.0, 2.0, 4.0));
            bvk $$2 = new bvk(this.dV(), this.dA(), this.dC(), this.dG());
            bvs $$3 = this.q();
            if ($$3 instanceof bwr) {
               $$2.a((bwr)$$3);
            }

            $$2.a(lv.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new buw(buy.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwr $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dA(), $$4.dC(), $$4.dG());
                     break;
                  }
               }
            }

            this.dV().c(2006, this.dv(), this.bb() ? -1 : 1);
            this.dV().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lt j() {
      return lv.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
