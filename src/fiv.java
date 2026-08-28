import java.util.function.IntFunction;

public enum fiv implements azi {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fiv> d = axw.a(fiv::b, values(), axw.a.b);
   private final int e;
   private final String f;

   private fiv(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
      return this.f;
   }

   public static fiv a(int $$0) {
      return d.apply($$0);
   }
}
