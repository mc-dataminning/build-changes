import javax.annotation.Nullable;

public class ctg extends csj {
   public ctg(bxe<? extends ctg> $$0, djz $$1) {
      super($$0, $$1);
   }

   public ctg(djz $$0, bxw $$1, daa $$2) {
      super(bxe.aX, $$0, $$1, $$2);
   }

   public ctg(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.aX, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czw g() {
      return dae.wC;
   }

   @Override
   public void a(aru $$0, daa $$1, @Nullable bwv $$2) {
      bwn $$3 = new bwn(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bxw $$4) {
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
