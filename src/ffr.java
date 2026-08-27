import java.util.Locale;
import java.util.function.Supplier;

public class ffr extends ffn {
   private static final int f = -65536;
   private static final int g = -256;
   private static final int h = -16711936;
   private static final int i = -6745839;
   private static final int j = -4548257;
   private static final int k = -10547572;
   private final Supplier<Float> l;

   public ffr(fdj $$0, bkd $$1, Supplier<Float> $$2) {
      super($$0, $$1);
      this.l = $$2;
   }

   @Override
   protected void d(fdl $$0, int $$1, int $$2, int $$3) {
      float $$4 = (float)ayl.c / this.l.get();
      this.a($$0, String.format("%.1f TPS", $$4), $$1 + 1, $$3 - 60 + 1);
   }

   @Override
   protected void c(fdl $$0, int $$1, int $$2, int $$3) {
      long $$4 = this.e.a($$3, bke.b.ordinal());
      int $$5 = this.b((double)$$4);
      $$0.a(gaq.E(), $$2, $$1 - $$5, $$2 + 1, $$1, -6745839);
      long $$6 = this.e.a($$3, bke.c.ordinal());
      int $$7 = this.b((double)$$6);
      $$0.a(gaq.E(), $$2, $$1 - $$5 - $$7, $$2 + 1, $$1 - $$5, -4548257);
      long $$8 = this.e.a($$3) - this.e.a($$3, bke.d.ordinal()) - $$4 - $$6;
      int $$9 = this.b((double)$$8);
      $$0.a(gaq.E(), $$2, $$1 - $$9 - $$7 - $$5, $$2 + 1, $$1 - $$7 - $$5, -10547572);
   }

   @Override
   protected long b(int $$0) {
      return this.e.a($$0) - this.e.a($$0, bke.d.ordinal());
   }

   @Override
   protected String a(double $$0) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(c($$0)));
   }

   @Override
   protected int b(double $$0) {
      return (int)Math.round(c($$0) * 60.0 / (double)this.l.get().floatValue());
   }

   @Override
   protected int a(long $$0) {
      float $$1 = this.l.get();
      return this.a(c((double)$$0), (double)$$1, -16711936, (double)$$1 * 1.125, -256, (double)$$1 * 1.25, -65536);
   }

   private static double c(double $$0) {
      return $$0 / 1000000.0;
   }
}
