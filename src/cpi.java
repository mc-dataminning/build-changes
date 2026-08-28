import java.util.List;

public class cpi extends cpg {
   public static final float d = 4.0F;

   public cpi(but<? extends cpi> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpi(dgj $$0, bvi $$1, fbb $$2) {
      super(but.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if ($$0.d() != faz.a.c || !this.e(((fay)$$0).a())) {
         if (!this.dV().C) {
            List<bvi> $$1 = this.dV().a(bvi.class, this.cR().c(4.0, 2.0, 4.0));
            buf $$2 = new buf(this.dV(), this.dA(), this.dC(), this.dG());
            bum $$3 = this.p();
            if ($$3 instanceof bvi) {
               $$2.a((bvi)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new btr(btt.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvi $$4 : $$1) {
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
   protected lr s() {
      return lt.h;
   }

   @Override
   protected boolean m() {
      return false;
   }
}
