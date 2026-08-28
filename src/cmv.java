import java.util.function.IntFunction;

public enum cmv implements azc {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final IntFunction<cmv> d = axp.a(cmv::a, values(), axp.a.b);
   private final int e;
   private final String f;

   private cmv(final int $$0, final String $$1) {
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

   public static cmv a(int $$0) {
      return d.apply($$0);
   }
}
