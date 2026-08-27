import java.util.List;

public class clq extends clo {
   public static final float e = 4.0F;

   public clq(brn<? extends clq> $$0, dad $$1) {
      super($$0, $$1);
   }

   public clq(dad $$0, bsa $$1, double $$2, double $$3, double $$4) {
      super(brn.A, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if ($$0.c() != etn.a.c || !this.e(((etm)$$0).a())) {
         if (!this.dN().B) {
            List<bsa> $$1 = this.dN().a(bsa.class, this.cI().c(4.0, 2.0, 4.0));
            brd $$2 = new brd(this.dN(), this.ds(), this.du(), this.dy());
            brh $$3 = this.u();
            if ($$3 instanceof bsa) {
               $$2.a((bsa)$$3);
            }

            $$2.a(kx.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.k());
            $$2.a(new bqt(bqv.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bsa $$4 : $$1) {
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
   public boolean a(bqf $$0, float $$1) {
      return false;
   }

   @Override
   protected kv v() {
      return kx.h;
   }

   @Override
   protected boolean r() {
      return false;
   }
}
