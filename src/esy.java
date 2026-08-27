import java.util.function.IntFunction;

public enum esy implements atk {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<esy> d = asb.a(esy::a, values(), asb.a.b);
   private final int e;
   private final String f;

   private esy(int $$0, String $$1) {
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

   public static esy a(int $$0) {
      return d.apply($$0);
   }
}
