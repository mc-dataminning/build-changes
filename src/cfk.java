import java.util.List;

public class cfk extends cfi {
   public static final float e = 4.0F;

   public cfk(blt<? extends cfk> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfk(cti $$0, bmf $$1, double $$2, double $$3, double $$4) {
      super(blt.y, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(elk $$0) {
      super.a($$0);
      if ($$0.c() != elk.a.c || !this.d(((elj)$$0).a())) {
         if (!this.dM().B) {
            List<bmf> $$1 = this.dM().a(bmf.class, this.cH().c(4.0, 2.0, 4.0));
            blm $$2 = new blm(this.dM(), this.dr(), this.dt(), this.dx());
            blp $$3 = this.w();
            if ($$3 instanceof bmf) {
               $$2.a((bmf)$$3);
            }

            $$2.a(jx.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new blc(ble.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bmf $$4 : $$1) {
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
   public boolean a(bkn $$0, float $$1) {
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
