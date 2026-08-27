import java.util.Locale;

public class evb extends eux {
   private static final int f = -65536;
   private static final int g = -256;
   private static final int h = -16711936;
   private static final int i = 50;

   public evb(esw $$0, atg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(esy $$0, int $$1, int $$2, int $$3) {
      this.a($$0, "20 TPS", $$1 + 1, $$3 - 60 + 1);
   }

   @Override
   protected String a(double $$0) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(c($$0)));
   }

   @Override
   protected int b(double $$0) {
      return (int)Math.round(c($$0) * 60.0 / 50.0);
   }

   @Override
   protected int a(long $$0) {
      return this.a(c((double)$$0), 0.0, -16711936, 25.0, -256, 50.0, -65536);
   }

   private static double c(double $$0) {
      return $$0 / 1000000.0;
   }
}
