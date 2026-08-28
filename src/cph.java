import java.util.List;

public class cph extends cpf {
   public static final float d = 4.0F;

   public cph(bus<? extends cph> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cph(dgi $$0, bvh $$1, fba $$2) {
      super(bus.J, $$1, $$2, $$0);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if ($$0.d() != fay.a.c || !this.e(((fax)$$0).a())) {
         if (!this.dV().C) {
            List<bvh> $$1 = this.dV().a(bvh.class, this.cR().c(4.0, 2.0, 4.0));
            bue $$2 = new bue(this.dV(), this.dA(), this.dC(), this.dG());
            bul $$3 = this.p();
            if ($$3 instanceof bvh) {
               $$2.a((bvh)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new btq(bts.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvh $$4 : $$1) {
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
