import java.util.function.IntFunction;

public enum fmk implements bah {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fmk> d = ayv.a(fmk::b, values(), ayv.a.b);
   private final int e;
   private final String f;

   private fmk(final int $$0, final String $$1) {
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

   public static fmk a(int $$0) {
      return d.apply($$0);
   }
}
