import java.util.function.IntFunction;

public enum fnj implements azn {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<fnj> d = aya.a(fnj::b, values(), aya.a.b);
   private final int e;
   private final String f;

   private fnj(final int $$0, final String $$1) {
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

   public static fnj a(int $$0) {
      return d.apply($$0);
   }
}
