public abstract class ewd {
   protected final ewf a;

   protected ewd(ewf $$0) {
      this.a = $$0;
   }

   public double a(bsg $$0) {
      double $$1 = this.a.c - $$0.dv();
      double $$2 = this.a.d - $$0.dx();
      double $$3 = this.a.e - $$0.dB();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ewd.a c();

   public ewf e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
