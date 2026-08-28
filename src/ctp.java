import javax.annotation.Nullable;

public class ctp extends css {
   public ctp(bxn<? extends ctp> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctp(dkj $$0, byf $$1, dak $$2) {
      super(bxn.aX, $$0, $$1, $$2);
   }

   public ctp(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.aX, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dag f() {
      return dao.wC;
   }

   @Override
   public void a(asb $$0, dak $$1, @Nullable bxe $$2) {
      bww $$3 = new bww(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.p() instanceof byf $$4) {
         $$3.a($$4);
      }

      $$3.a(3.0F);
      $$3.c(-0.5F);
      $$3.a(600);
      $$3.c(10);
      $$3.d(-$$3.c() / (float)$$3.h());
      $$3.c($$1);
      $$0.b($$3);
   }
}
