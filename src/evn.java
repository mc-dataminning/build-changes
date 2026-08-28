public abstract class evn {
   protected final evp a;

   protected evn(evp $$0) {
      this.a = $$0;
   }

   public double a(bss $$0) {
      double $$1 = this.a.c - $$0.du();
      double $$2 = this.a.d - $$0.dw();
      double $$3 = this.a.e - $$0.dA();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract evn.a c();

   public evp e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
