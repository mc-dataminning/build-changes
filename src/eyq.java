import java.util.Locale;
import java.util.function.Supplier;

public class eyq extends eym {
   private static final int f = -65536;
   private static final int g = -256;
   private static final int h = -16711936;
   private final Supplier<Float> i;

   public eyq(ewk $$0, aur $$1, Supplier<Float> $$2) {
      super($$0, $$1);
      this.i = $$2;
   }

   @Override
   protected void a(ewm $$0, int $$1, int $$2, int $$3) {
      float $$4 = (float)avj.c / this.i.get();
      this.a($$0, String.format("%.1f TPS", $$4), $$1 + 1, $$3 - 60 + 1);
   }

   @Override
   protected String a(double $$0) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(c($$0)));
   }

   @Override
   protected int b(double $$0) {
      return (int)Math.round(c($$0) * 60.0 / (double)this.i.get().floatValue());
   }

   @Override
   protected int a(long $$0) {
      float $$1 = this.i.get();
      return this.a(c((double)$$0), 0.0, -16711936, (double)$$1 / 2.0, -256, (double)$$1, -65536);
   }

   private static double c(double $$0) {
      return $$0 / 1000000.0;
   }
}
