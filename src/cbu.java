import java.util.List;

public class cbu extends cbs {
   public static final float e = 4.0F;

   public cbu(bik<? extends cbu> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cbu(cpk $$0, biw $$1, double $$2, double $$3, double $$4) {
      super(bik.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if ($$0.c() != ehd.a.c || !this.d(((ehc)$$0).a())) {
         if (!this.dK().B) {
            List<biw> $$1 = this.dK().a(biw.class, this.cG().c(4.0, 2.0, 4.0));
            bid $$2 = new bid(this.dK(), this.dp(), this.dr(), this.dv());
            big $$3 = this.v();
            if ($$3 instanceof biw) {
               $$2.a((biw)$$3);
            }

            $$2.a(iw.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bht(bhv.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (biw $$4 : $$1) {
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
   public boolean a(bhe $$0, float $$1) {
      return false;
   }

   @Override
   protected iu m() {
      return iw.i;
   }

   @Override
   protected boolean aa_() {
      return false;
   }
}
