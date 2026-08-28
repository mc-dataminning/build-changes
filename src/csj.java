import javax.annotation.Nullable;

public class csj extends crm {
   public csj(bwo<? extends csj> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csj(dja $$0, bxe $$1, czd $$2) {
      super(bwo.aW, $$0, $$1, $$2);
   }

   public csj(dja $$0, double $$1, double $$2, double $$3, czd $$4) {
      super(bwo.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected cyz g() {
      return czh.wC;
   }

   @Override
   public void a(arq $$0, czd $$1, @Nullable bwf $$2) {
      bvx $$3 = new bvx(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bxe $$4) {
         $$3.a($$4);
      }

      $$3.a(3.0F);
      $$3.c(-0.5F);
      $$3.c(10);
      $$3.d(-$$3.e() / (float)$$3.i());
      $$3.c($$1);
      $$0.b($$3);
   }
}
