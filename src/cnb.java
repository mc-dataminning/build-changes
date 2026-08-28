import java.util.List;

public class cnb extends cmz {
   public static final float f = 4.0F;

   public cnb(bsv<? extends cnb> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnb(dbt $$0, btk $$1, double $$2, double $$3, double $$4) {
      super(bsv.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if ($$0.c() != evk.a.c || !this.A(((evj)$$0).a())) {
         if (!this.dP().B) {
            List<btk> $$1 = this.dP().a(btk.class, this.cK().c(4.0, 2.0, 4.0));
            bsl $$2 = new bsl(this.dP(), this.du(), this.dw(), this.dA());
            bsp $$3 = this.s();
            if ($$3 instanceof btk) {
               $$2.a((btk)$$3);
            }

            $$2.a(lj.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new brx(brz.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btk $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.du(), $$4.dw(), $$4.dA());
                     break;
                  }
               }
            }

            this.dP().c(2006, this.dp(), this.aW() ? -1 : 1);
            this.dP().b($$2);
            this.ao();
         }
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return false;
   }

   @Override
   protected lh v() {
      return lj.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
