import java.util.function.IntFunction;

public enum ffh implements ayx {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<ffh> d = axl.a(ffh::a, values(), axl.a.b);
   private final int e;
   private final String f;

   private ffh(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.f;
   }

   public static ffh a(int $$0) {
      return d.apply($$0);
   }
}
