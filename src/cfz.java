import java.util.List;

public class cfz extends cfx {
   public static final float e = 4.0F;

   public cfz(bmc<? extends cfz> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cfz(ctx $$0, bmo $$1, double $$2, double $$3, double $$4) {
      super(bmc.z, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if ($$0.c() != ema.a.c || !this.d(((elz)$$0).a())) {
         if (!this.dL().B) {
            List<bmo> $$1 = this.dL().a(bmo.class, this.cH().c(4.0, 2.0, 4.0));
            blt $$2 = new blt(this.dL(), this.dq(), this.ds(), this.dw());
            blw $$3 = this.w();
            if ($$3 instanceof bmo) {
               $$2.a((bmo)$$3);
            }

            $$2.a(jx.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.m());
            $$2.a(new blj(bll.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bmo $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dq(), $$4.ds(), $$4.dw());
                     break;
                  }
               }
            }

            this.dL().c(2006, this.dl(), this.aU() ? -1 : 1);
            this.dL().b($$2);
            this.am();
         }
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
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
