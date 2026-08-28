import java.util.List;

public class cng extends cne {
   public static final float e = 4.0F;

   public cng(bsx<? extends cng> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cng(dcw $$0, btn $$1, exc $$2) {
      super(bsx.A, $$1, $$2, $$0);
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if ($$0.c() != exa.a.c || !this.e(((ewz)$$0).a())) {
         if (!this.dO().B) {
            List<btn> $$1 = this.dO().a(btn.class, this.cK().c(4.0, 2.0, 4.0));
            bsn $$2 = new bsn(this.dO(), this.dt(), this.dv(), this.dz());
            bsr $$3 = this.s();
            if ($$3 instanceof btn) {
               $$2.a((btn)$$3);
            }

            $$2.a(lm.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.g()) / (float)$$2.j());
            $$2.a(new brz(bsb.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (btn $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dt(), $$4.dv(), $$4.dz());
                     break;
                  }
               }
            }

            this.dO().c(2006, this.do(), this.aX() ? -1 : 1);
            this.dO().b($$2);
            this.aq();
         }
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }

   @Override
   protected lk v() {
      return lm.h;
   }

   @Override
   protected boolean t() {
      return false;
   }
}
