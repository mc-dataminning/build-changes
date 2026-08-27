import java.util.function.IntFunction;

public enum chj implements awk {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final IntFunction<chj> d = ava.a(chj::a, values(), ava.a.b);
   private final int e;
   private final String f;

   private chj(int $$0, String $$1) {
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

   public static chj a(int $$0) {
      return d.apply($$0);
   }
}
