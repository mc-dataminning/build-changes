import java.util.List;

public class cfq extends cfo {
   public static final float e = 4.0F;

   public cfq(bly<? extends cfq> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cfq(cto $$0, bmk $$1, double $$2, double $$3, double $$4) {
      super(bly.y, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if ($$0.c() != elq.a.c || !this.d(((elp)$$0).a())) {
         if (!this.dM().B) {
            List<bmk> $$1 = this.dM().a(bmk.class, this.cH().c(4.0, 2.0, 4.0));
            blr $$2 = new blr(this.dM(), this.dr(), this.dt(), this.dx());
            blu $$3 = this.w();
            if ($$3 instanceof bmk) {
               $$2.a((bmk)$$3);
            }

            $$2.a(jx.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new blh(blj.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bmk $$4 : $$1) {
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
   public boolean a(bks $$0, float $$1) {
      return false;
   }

   @Override
   protected jv u() {
      return jx.i;
   }

   @Override
   protected boolean s() {
      return false;
   }
}
