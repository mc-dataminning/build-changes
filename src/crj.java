import java.util.List;

public class crj extends crg {
   public static final float d = 4.0F;

   public crj(bwm<? extends crj> $$0, div $$1) {
      super($$0, $$1);
   }

   public crj(div $$0, bxc $$1, fei $$2) {
      super(bwm.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if ($$0.d() != feg.a.c || !this.e(((fef)$$0).a())) {
         if (!this.dV().C) {
            List<bxc> $$1 = this.dV().a(bxc.class, this.cR().c(4.0, 2.0, 4.0));
            bvv $$2 = new bvv(this.dV(), this.dA(), this.dC(), this.dG());
            bwd $$3 = this.q();
            if ($$3 instanceof bxc) {
               $$2.a((bxc)$$3);
            }

            $$2.a(lx.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bvh(bvj.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bxc $$4 : $$1) {
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
   protected lv j() {
      return lx.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
