import java.util.List;

public class csl extends csi {
   public static final float d = 4.0F;

   public csl(bxe<? extends csl> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csl(djz $$0, bxw $$1, ffs $$2) {
      super(bxe.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if ($$0.d() != ffq.a.c || !this.e(((ffp)$$0).a())) {
         if (!this.dV().C) {
            List<bxw> $$1 = this.dV().a(bxw.class, this.cR().c(4.0, 2.0, 4.0));
            bwn $$2 = new bwn(this.dV(), this.dA(), this.dC(), this.dG());
            bwv $$3 = this.q();
            if ($$3 instanceof bxw) {
               $$2.a((bxw)$$3);
            }

            $$2.a(lz.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bvz(bwb.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bxw $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dA(), $$4.dC(), $$4.dG());
                     break;
                  }
               }
            }

            this.dV().c(2006, this.dv(), this.ba() ? -1 : 1);
            this.dV().b($$2);
            this.aq();
         }
      }
   }

   @Override
   protected lx j() {
      return lz.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
