import java.util.List;

public class cei extends ceg {
   public static final float e = 4.0F;

   public cei(bkz<? extends cei> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cei(csf $$0, bll $$1, double $$2, double $$3, double $$4) {
      super(bkz.x, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if ($$0.c() != ejx.a.c || !this.d(((ejw)$$0).a())) {
         if (!this.dN().B) {
            List<bll> $$1 = this.dN().a(bll.class, this.cH().c(4.0, 2.0, 4.0));
            bks $$2 = new bks(this.dN(), this.ds(), this.du(), this.dy());
            bkv $$3 = this.w();
            if ($$3 instanceof bll) {
               $$2.a((bll)$$3);
            }

            $$2.a(jw.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bki(bkk.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bll $$4 : $$1) {
                  double $$5 = this.f($$4);
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
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return false;
   }

   @Override
   protected ju s() {
      return jw.i;
   }

   @Override
   protected boolean ag_() {
      return false;
   }
}
