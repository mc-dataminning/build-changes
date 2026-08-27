public abstract class ehb {
   protected final ehd a;

   protected ehb(ehd $$0) {
      this.a = $$0;
   }

   public double a(bii $$0) {
      double $$1 = this.a.c - $$0.dp();
      double $$2 = this.a.d - $$0.dr();
      double $$3 = this.a.e - $$0.dv();
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public abstract ehb.a c();

   public ehd e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
