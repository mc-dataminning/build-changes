import java.util.List;

public class crd extends cra {
   public static final float d = 4.0F;

   public crd(bwj<? extends crd> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crd(dip $$0, bwz $$1, fdw $$2) {
      super(bwj.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if ($$0.d() != fdu.a.c || !this.e(((fdt)$$0).a())) {
         if (!this.dV().C) {
            List<bwz> $$1 = this.dV().a(bwz.class, this.cR().c(4.0, 2.0, 4.0));
            bvs $$2 = new bvs(this.dV(), this.dA(), this.dC(), this.dG());
            bwa $$3 = this.q();
            if ($$3 instanceof bwz) {
               $$2.a((bwz)$$3);
            }

            $$2.a(lx.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bve(bvg.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwz $$4 : $$1) {
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
