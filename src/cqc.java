import java.util.List;

public class cqc extends cqa {
   public static final float d = 4.0F;

   public cqc(bvm<? extends cqc> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqc(dha $$0, bwb $$1, fbs $$2) {
      super(bvm.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if ($$0.d() != fbq.a.c || !this.e(((fbp)$$0).a())) {
         if (!this.dV().C) {
            List<bwb> $$1 = this.dV().a(bwb.class, this.cR().c(4.0, 2.0, 4.0));
            buy $$2 = new buy(this.dV(), this.dA(), this.dC(), this.dG());
            bvf $$3 = this.p();
            if ($$3 instanceof bwb) {
               $$2.a((bwb)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new buk(bum.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwb $$4 : $$1) {
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
   protected lq s() {
      return ls.h;
   }

   @Override
   protected boolean m() {
      return false;
   }
}
