import java.util.List;

public class cmf extends cmd {
   public static final float e = 4.0F;

   public cmf(bsa<? extends cmf> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmf(dax $$0, bso $$1, double $$2, double $$3, double $$4) {
      super(bsa.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if ($$0.c() != eui.a.c || !this.e(((euh)$$0).a())) {
         if (!this.dP().B) {
            List<bso> $$1 = this.dP().a(bso.class, this.cK().c(4.0, 2.0, 4.0));
            brq $$2 = new brq(this.dP(), this.du(), this.dw(), this.dA());
            bru $$3 = this.s();
            if ($$3 instanceof bso) {
               $$2.a((bso)$$3);
            }

            $$2.a(ky.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new brc(bre.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bso $$4 : $$1) {
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
   public boolean bz() {
      return false;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      return false;
   }

   @Override
   protected kw v() {
      return ky.h;
   }

   @Override
   protected boolean u() {
      return false;
   }
}
