import java.util.function.IntFunction;

public enum ffl implements azb {
   a(0, "options.prioritizeChunkUpdates.none"),
   b(1, "options.prioritizeChunkUpdates.byPlayer"),
   c(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<ffl> d = axo.a(ffl::a, values(), axo.a.b);
   private final int e;
   private final String f;

   private ffl(final int $$0, final String $$1) {
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

   public static ffl a(int $$0) {
      return d.apply($$0);
   }
}
