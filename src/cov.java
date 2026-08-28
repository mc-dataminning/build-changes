import java.util.function.IntFunction;

public enum cov implements azc {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final IntFunction<cov> d = axq.a(cov::b, values(), axq.a.b);
   private final int e;
   private final String f;

   private cov(final int $$0, final String $$1) {
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

   public static cov a(int $$0) {
      return d.apply($$0);
   }
}
