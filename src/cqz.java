import java.util.function.IntFunction;

public enum cqz implements azp {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final IntFunction<cqz> d = ayc.a(cqz::b, values(), ayc.a.b);
   private final int e;
   private final String f;

   private cqz(final int $$0, final String $$1) {
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

   public static cqz a(int $$0) {
      return d.apply($$0);
   }
}
