import java.util.List;

public class cpg extends cpe {
   public static final float d = 4.0F;

   public cpg(bur<? extends cpg> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpg(dgh $$0, bvg $$1, faz $$2) {
      super(bur.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if ($$0.d() != fax.a.c || !this.e(((faw)$$0).a())) {
         if (!this.dV().C) {
            List<bvg> $$1 = this.dV().a(bvg.class, this.cR().c(4.0, 2.0, 4.0));
            bud $$2 = new bud(this.dV(), this.dA(), this.dC(), this.dG());
            buk $$3 = this.p();
            if ($$3 instanceof bvg) {
               $$2.a((bvg)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new btp(btr.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvg $$4 : $$1) {
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
