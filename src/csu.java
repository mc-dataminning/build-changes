import java.util.List;

public class csu extends csr {
   public static final float d = 4.0F;

   public csu(bxn<? extends csu> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public csu(dkj $$0, byf $$1, fgc $$2) {
      super(bxn.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if ($$0.d() != fga.a.c || !this.e(((ffz)$$0).a())) {
         if (!this.dV().C) {
            List<byf> $$1 = this.dV().a(byf.class, this.cR().c(4.0, 2.0, 4.0));
            bww $$2 = new bww(this.dV(), this.dA(), this.dC(), this.dG());
            bxe $$3 = this.q();
            if ($$3 instanceof byf) {
               $$2.a((byf)$$3);
            }

            $$2.a(lz.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bwi(bwk.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (byf $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dA(), $$4.dC(), $$4.dG());
                     break;
                  }
               }
            }

            this.dV().c(2006, this.dv(), this.ba() ? -1 : 1);
            this.dV().b($$2);
            this.aq();
         }
      }
   }

   @Override
   protected lx j() {
      return lz.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
