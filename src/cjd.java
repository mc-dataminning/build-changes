import java.util.List;

public class cjd extends cjb {
   public static final float e = 4.0F;

   public cjd(bpd<? extends cjd> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjd(cxb $$0, bpp $$1, double $$2, double $$3, double $$4) {
      super(bpd.B, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if ($$0.c() != epr.a.c || !this.e(((epq)$$0).a())) {
         if (!this.dM().B) {
            List<bpp> $$1 = this.dM().a(bpp.class, this.cH().c(4.0, 2.0, 4.0));
            bou $$2 = new bou(this.dM(), this.dr(), this.dt(), this.dx());
            box $$3 = this.af_();
            if ($$3 instanceof bpp) {
               $$2.a((bpp)$$3);
            }

            $$2.a(kc.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new bok(bom.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bpp $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dr(), $$4.dt(), $$4.dx());
                     break;
                  }
               }
            }

            this.dM().c(2006, this.dm(), this.aU() ? -1 : 1);
            this.dM().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      return false;
   }

   @Override
   protected ka s() {
      return kc.i;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
