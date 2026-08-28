import java.util.List;

public class cqg extends cqe {
   public static final float d = 4.0F;

   public cqg(bvq<? extends cqg> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqg(dhh $$0, bwf $$1, fbx $$2) {
      super(bvq.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if ($$0.d() != fbv.a.c || !this.e(((fbu)$$0).a())) {
         if (!this.dV().C) {
            List<bwf> $$1 = this.dV().a(bwf.class, this.cR().c(4.0, 2.0, 4.0));
            bvc $$2 = new bvc(this.dV(), this.dA(), this.dC(), this.dG());
            bvj $$3 = this.p();
            if ($$3 instanceof bwf) {
               $$2.a((bwf)$$3);
            }

            $$2.a(ls.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new buo(buq.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bwf $$4 : $$1) {
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
