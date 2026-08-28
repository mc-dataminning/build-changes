import java.util.List;

public class cro extends crl {
   public static final float d = 4.0F;

   public cro(bwo<? extends cro> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cro(dja $$0, bxe $$1, feq $$2) {
      super(bwo.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(feo $$0) {
      super.a($$0);
      if ($$0.d() != feo.a.c || !this.e(((fen)$$0).a())) {
         if (!this.dV().C) {
            List<bxe> $$1 = this.dV().a(bxe.class, this.cR().c(4.0, 2.0, 4.0));
            bvx $$2 = new bvx(this.dV(), this.dA(), this.dC(), this.dG());
            bwf $$3 = this.q();
            if ($$3 instanceof bxe) {
               $$2.a((bxe)$$3);
            }

            $$2.a(lx.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bvj(bvl.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bxe $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dA(), $$4.dC(), $$4.dG());
                     break;
                  }
               }
            }

            this.dV().c(2006, this.dv(), this.bb() ? -1 : 1);
            this.dV().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lv j() {
      return lx.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
