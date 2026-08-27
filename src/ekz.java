public abstract class ekz {
   protected final elb a;

   protected ekz(elb $$0) {
      this.a = $$0;
   }

   public double a(blf $$0) {
      double $$1 = this.a.c - $$0.dr();
      double $$2 = this.a.d - $$0.dt();
      double $$3 = this.a.e - $$0.dx();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ekz.a c();

   public elb e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
