import java.util.function.IntFunction;

public enum fgd implements ayj {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fgd> d = aww.a(fgd::a, values(), aww.a.b);
   private final int e;
   private final String f;

   private fgd(final int $$0, final String $$1) {
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

   public static fgd a(int $$0) {
      return d.apply($$0);
   }
}
