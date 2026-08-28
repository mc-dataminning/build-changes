import javax.annotation.Nullable;

public class cte extends csh {
   public cte(bxc<? extends cte> $$0, djx $$1) {
      super($$0, $$1);
   }

   public cte(djx $$0, bxu $$1, czy $$2) {
      super(bxc.aX, $$0, $$1, $$2);
   }

   public cte(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.aX, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czu g() {
      return dac.wC;
   }

   @Override
   public void a(ars $$0, czy $$1, @Nullable bwt $$2) {
      bwl $$3 = new bwl(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bxu $$4) {
         $$3.a($$4);
      }

      $$3.a(3.0F);
      $$3.c(-0.5F);
      $$3.a(600);
      $$3.c(10);
      $$3.d(-$$3.e() / (float)$$3.i());
      $$3.c($$1);
      $$0.b($$3);
   }
}
