import java.util.List;

public class cbv extends cbt {
   public static final float e = 4.0F;

   public cbv(bim<? extends cbv> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cbv(cpl $$0, biy $$1, double $$2, double $$3, double $$4) {
      super(bim.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if ($$0.c() != ehb.a.c || !this.d(((eha)$$0).a())) {
         if (!this.dK().B) {
            List<biy> $$1 = this.dK().a(biy.class, this.cG().c(4.0, 2.0, 4.0));
            bif $$2 = new bif(this.dK(), this.dp(), this.dr(), this.dv());
            bii $$3 = this.v();
            if ($$3 instanceof biy) {
               $$2.a((biy)$$3);
            }

            $$2.a(iv.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bhv(bhx.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (biy $$4 : $$1) {
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
   public boolean a(bhg $$0, float $$1) {
      return false;
   }

   @Override
   protected it m() {
      return iv.i;
   }

   @Override
   protected boolean Z_() {
      return false;
   }
}
