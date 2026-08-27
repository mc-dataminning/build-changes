import java.util.List;

public class cby extends cbw {
   public static final float e = 4.0F;

   public cby(bip<? extends cby> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cby(cpq $$0, bjb $$1, double $$2, double $$3, double $$4) {
      super(bip.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if ($$0.c() != ehg.a.c || !this.d(((ehf)$$0).a())) {
         if (!this.dK().B) {
            List<bjb> $$1 = this.dK().a(bjb.class, this.cG().c(4.0, 2.0, 4.0));
            bii $$2 = new bii(this.dK(), this.dp(), this.dr(), this.dv());
            bil $$3 = this.v();
            if ($$3 instanceof bjb) {
               $$2.a((bjb)$$3);
            }

            $$2.a(ix.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bhy(bia.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bjb $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.e($$4.dp(), $$4.dr(), $$4.dv());
                     break;
                  }
               }
            }

            this.dK().c(2006, this.dk(), this.aS() ? -1 : 1);
            this.dK().b($$2);
            this.ak();
         }
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      return false;
   }

   @Override
   protected iv m() {
      return ix.i;
   }

   @Override
   protected boolean Z_() {
      return false;
   }
}
