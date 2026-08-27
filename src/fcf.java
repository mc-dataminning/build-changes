import java.util.function.IntFunction;

public enum fcf implements axo {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fcf> d = awd.a(fcf::a, values(), awd.a.b);
   private final int e;
   private final String f;

   private fcf(int $$0, String $$1) {
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

   public static fcf a(int $$0) {
      return d.apply($$0);
   }
}
