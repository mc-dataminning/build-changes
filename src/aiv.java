import org.jetbrains.annotations.VisibleForTesting;

public class aiv {
   private static final double a = 4096.0;
   private ezn b = ezn.c;

   @VisibleForTesting
   static long a(double $$0) {
      return Math.round($$0 * 4096.0);
   }

   @VisibleForTesting
   static double a(long $$0) {
      return (double)$$0 / 4096.0;
   }

   public ezn a(long $$0, long $$1, long $$2) {
      if ($$0 == 0L && $$1 == 0L && $$2 == 0L) {
         return this.b;
      } else {
         double $$3 = $$0 == 0L ? this.b.d : a(a(this.b.d) + $$0);
         double $$4 = $$1 == 0L ? this.b.e : a(a(this.b.e) + $$1);
         double $$5 = $$2 == 0L ? this.b.f : a(a(this.b.f) + $$2);
         return new ezn($$3, $$4, $$5);
      }
   }

   public long a(ezn $$0) {
      return a($$0.d) - a(this.b.d);
   }

   public long b(ezn $$0) {
      return a($$0.e) - a(this.b.e);
   }

   public long c(ezn $$0) {
      return a($$0.f) - a(this.b.f);
   }

   public ezn d(ezn $$0) {
      return $$0.d(this.b);
   }

   public void e(ezn $$0) {
      this.b = $$0;
   }

   public ezn a() {
      return this.b;
   }
}
