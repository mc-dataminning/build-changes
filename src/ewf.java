public abstract class ewf {
   protected final ewh a;

   protected ewf(ewh $$0) {
      this.a = $$0;
   }

   public double a(bsh $$0) {
      double $$1 = this.a.c - $$0.dw();
      double $$2 = this.a.d - $$0.dy();
      double $$3 = this.a.e - $$0.dC();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ewf.a c();

   public ewh e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
