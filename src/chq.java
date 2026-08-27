import java.util.List;

public class chq extends cho {
   public static final float e = 4.0F;

   public chq(bnu<? extends chq> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public chq(cvn $$0, bog $$1, double $$2, double $$3, double $$4) {
      super(bnu.z, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);
      if ($$0.c() != enq.a.c || !this.d(((enp)$$0).a())) {
         if (!this.dM().B) {
            List<bog> $$1 = this.dM().a(bog.class, this.cH().c(4.0, 2.0, 4.0));
            bnl $$2 = new bnl(this.dM(), this.dr(), this.dt(), this.dx());
            bno $$3 = this.w();
            if ($$3 instanceof bog) {
               $$2.a((bog)$$3);
            }

            $$2.a(jz.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new bnb(bnd.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bog $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dr(), $$4.dt(), $$4.dx());
                     break;
                  }
               }
            }

            this.dM().c(2006, this.dm(), this.aU() ? -1 : 1);
            this.dM().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      return false;
   }

   @Override
   protected jx u() {
      return jz.i;
   }

   @Override
   protected boolean s() {
      return false;
   }
}
