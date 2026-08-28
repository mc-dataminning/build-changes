import java.util.Locale;

public class ftz extends fty {
   private static final int f = -16711681;
   private static final int g = -6250241;
   private static final int h = -65536;
   private static final int i = 1024;
   private static final int j = 1048576;
   private static final int k = 1048576;

   public ftz(frt $$0, bpc $$1) {
      super($$0, $$1);
   }

   @Override
   protected void d(frv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, 64);
      this.a($$0, $$1, $$2, $$3, 1024);
      this.a($$0, $$1, $$2, $$3, 16384);
      this.a($$0, c(1048576.0), $$1 + 1, $$3 - d(1048576.0) + 1);
   }

   private void a(frv $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3 - d((double)$$4), c((double)$$4));
   }

   private void a(frv $$0, int $$1, int $$2, int $$3, String $$4) {
      this.a($$0, $$4, $$1 + 1, $$3 + 1);
      $$0.a(gqk.M(), $$1, $$1 + $$2 - 1, $$3, -1);
   }

   @Override
   protected String a(double $$0) {
      return c(e($$0));
   }

   private static String c(double $$0) {
      if ($$0 >= 1048576.0) {
         return String.format(Locale.ROOT, "%.1f MiB/s", $$0 / 1048576.0);
      } else {
         return $$0 >= 1024.0 ? String.format(Locale.ROOT, "%.1f KiB/s", $$0 / 1024.0) : String.format(Locale.ROOT, "%d B/s", azm.a($$0));
      }
   }

   @Override
   protected int b(double $$0) {
      return d(e($$0));
   }

   private static int d(double $$0) {
      return (int)Math.round(Math.log($$0 + 1.0) * 60.0 / Math.log(1048576.0));
   }

   @Override
   protected int a(long $$0) {
      return this.a(e((double)$$0), 0.0, -16711681, 8192.0, -6250241, 1.048576E7, -65536);
   }

   private static double e(double $$0) {
      return $$0 * 20.0;
   }
}
