import java.util.List;

public class cku extends cks {
   public static final float e = 4.0F;

   public cku(bqr<? extends cku> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cku(czu $$0, bre $$1, double $$2, double $$3, double $$4) {
      super(bqr.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if ($$0.c() != etd.a.c || !this.e(((etc)$$0).a())) {
         if (!this.dN().B) {
            List<bre> $$1 = this.dN().a(bre.class, this.cI().c(4.0, 2.0, 4.0));
            bqh $$2 = new bqh(this.dN(), this.ds(), this.du(), this.dy());
            bql $$3 = this.u();
            if ($$3 instanceof bre) {
               $$2.a((bre)$$3);
            }

            $$2.a(kw.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new bpx(bpz.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bre $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.ds(), $$4.du(), $$4.dy());
                     break;
                  }
               }
            }

            this.dN().c(2006, this.dn(), this.aU() ? -1 : 1);
            this.dN().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return false;
   }

   @Override
   protected ku v() {
      return kw.h;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
