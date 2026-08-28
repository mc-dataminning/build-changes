import javax.annotation.Nullable;

public class cse extends crh {
   public cse(bwm<? extends cse> $$0, div $$1) {
      super($$0, $$1);
   }

   public cse(div $$0, bxc $$1, cyy $$2) {
      super(bwm.aW, $$0, $$1, $$2);
   }

   public cse(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      super(bwm.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected cyu g() {
      return czc.wx;
   }

   @Override
   public void a(arq $$0, cyy $$1, @Nullable bwd $$2) {
      bvv $$3 = new bvv(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bxc $$4) {
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
