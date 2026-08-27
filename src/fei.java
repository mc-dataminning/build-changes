import java.util.function.IntFunction;

public enum fei implements ayh {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fei> d = aww.a(fei::a, values(), aww.a.b);
   private final int e;
   private final String f;

   private fei(int $$0, String $$1) {
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

   public static fei a(int $$0) {
      return d.apply($$0);
   }
}
