import java.util.function.IntFunction;

public enum fmf implements azx {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fmf> d = ayl.a(fmf::b, values(), ayl.a.b);
   private final int e;
   private final String f;

   private fmf(final int $$0, final String $$1) {
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

   public static fmf a(int $$0) {
      return d.apply($$0);
   }
}
