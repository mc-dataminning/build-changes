import org.jetbrains.annotations.VisibleForTesting;

public class ago {
   private static final double a = 4096.0;
   private ens b;

   public ago() {
      this.b = ens.b;
   }

   @VisibleForTesting
   static long a(double $$0) {
      return Math.round($$0 * 4096.0);
   }

   @VisibleForTesting
   static double a(long $$0) {
      return (double)$$0 / 4096.0;
   }

   public ens a(long $$0, long $$1, long $$2) {
      if ($$0 == 0L && $$1 == 0L && $$2 == 0L) {
         return this.b;
      } else {
         double $$3 = $$0 == 0L ? this.b.c : a(a(this.b.c) + $$0);
         double $$4 = $$1 == 0L ? this.b.d : a(a(this.b.d) + $$1);
         double $$5 = $$2 == 0L ? this.b.e : a(a(this.b.e) + $$2);
         return new ens($$3, $$4, $$5);
      }
   }

   public long a(ens $$0) {
      return a($$0.c) - a(this.b.c);
   }

   public long b(ens $$0) {
      return a($$0.d) - a(this.b.d);
   }

   public long c(ens $$0) {
      return a($$0.e) - a(this.b.e);
   }

   public ens d(ens $$0) {
      return $$0.d(this.b);
   }

   public void e(ens $$0) {
      this.b = $$0;
   }
}
