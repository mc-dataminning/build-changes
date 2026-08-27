import java.util.Locale;

public class fke extends fkc {
   private static final int f = -65536;
   private static final int g = -256;
   private static final int h = -16711936;
   private static final int i = 30;
   private static final double j = 33.333333333333336;

   public fke(fhy $$0, ble $$1) {
      super($$0, $$1);
   }

   @Override
   protected void d(fia $$0, int $$1, int $$2, int $$3) {
      this.a($$0, "30 FPS", $$1 + 1, $$3 - 60 + 1);
      this.a($$0, "60 FPS", $$1 + 1, $$3 - 30 + 1);
      $$0.a(gfo.F(), $$1, $$1 + $$2 - 1, $$3 - 30, -1);
      int $$4 = fgj.Q().m.h().c();
      if ($$4 > 0 && $$4 <= 250) {
         $$0.a(gfo.F(), $$1, $$1 + $$2 - 1, $$3 - this.b(1.0E9 / (double)$$4) - 1, -16711681);
      }
   }

   @Override
   protected String a(double $$0) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(c($$0)));
   }

   @Override
   protected int b(double $$0) {
      return (int)Math.round(c($$0) * 60.0 / 33.333333333333336);
   }

   @Override
   protected int a(long $$0) {
      return this.a(c((double)$$0), 0.0, -16711936, 28.0, -256, 56.0, -65536);
   }

   private static double c(double $$0) {
      return $$0 / 1000000.0;
   }
}
