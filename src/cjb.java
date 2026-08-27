import java.util.List;

public class cjb extends ciz {
   public static final float e = 4.0F;

   public cjb(bpc<? extends cjb> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cjb(cwz $$0, bpo $$1, double $$2, double $$3, double $$4) {
      super(bpc.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if ($$0.c() != epp.a.c || !this.e(((epo)$$0).a())) {
         if (!this.dM().B) {
            List<bpo> $$1 = this.dM().a(bpo.class, this.cH().c(4.0, 2.0, 4.0));
            bot $$2 = new bot(this.dM(), this.dr(), this.dt(), this.dx());
            bow $$3 = this.af_();
            if ($$3 instanceof bpo) {
               $$2.a((bpo)$$3);
            }

            $$2.a(kc.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new boj(bol.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bpo $$4 : $$1) {
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
   public boolean a(bnv $$0, float $$1) {
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
