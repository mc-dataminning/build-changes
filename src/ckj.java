import java.util.List;

public class ckj extends ckh {
   public static final float e = 4.0F;

   public ckj(bqg<? extends ckj> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckj(czg $$0, bqt $$1, double $$2, double $$3, double $$4) {
      super(bqg.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if ($$0.c() != esh.a.c || !this.e(((esg)$$0).a())) {
         if (!this.dM().B) {
            List<bqt> $$1 = this.dM().a(bqt.class, this.cH().c(4.0, 2.0, 4.0));
            bpw $$2 = new bpw(this.dM(), this.dr(), this.dt(), this.dx());
            bqa $$3 = this.u();
            if ($$3 instanceof bqt) {
               $$2.a((bqt)$$3);
            }

            $$2.a(kn.i);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new bpm(bpo.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bqt $$4 : $$1) {
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
   public boolean a(boy $$0, float $$1) {
      return false;
   }

   @Override
   protected kl v() {
      return kn.i;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
