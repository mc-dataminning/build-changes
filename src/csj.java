import java.util.List;

public class csj extends csg {
   public static final float d = 4.0F;

   public csj(bxc<? extends csj> $$0, djx $$1) {
      super($$0, $$1);
   }

   public csj(djx $$0, bxu $$1, ffq $$2) {
      super(bxc.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if ($$0.d() != ffo.a.c || !this.e(((ffn)$$0).a())) {
         if (!this.dV().C) {
            List<bxu> $$1 = this.dV().a(bxu.class, this.cR().c(4.0, 2.0, 4.0));
            bwl $$2 = new bwl(this.dV(), this.dA(), this.dC(), this.dG());
            bwt $$3 = this.q();
            if ($$3 instanceof bxu) {
               $$2.a((bxu)$$3);
            }

            $$2.a(ly.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.e()) / (float)$$2.i());
            $$2.b(0.25F);
            $$2.a(new bvx(bvz.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bxu $$4 : $$1) {
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
   protected lw j() {
      return ly.h;
   }

   @Override
   protected boolean g() {
      return false;
   }
}
