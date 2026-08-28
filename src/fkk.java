import java.util.function.IntFunction;

public enum fkk implements azp {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fkk> d = ayd.a(fkk::b, values(), ayd.a.b);
   private final int e;
   private final String f;

   private fkk(final int $$0, final String $$1) {
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

   public static fkk a(int $$0) {
      return d.apply($$0);
   }
}
