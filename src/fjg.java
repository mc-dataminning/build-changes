import java.util.function.IntFunction;

public enum fjg implements azm {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fjg> d = aya.a(fjg::b, values(), aya.a.b);
   private final int e;
   private final String f;

   private fjg(final int $$0, final String $$1) {
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

   public static fjg a(int $$0) {
      return d.apply($$0);
   }
}
