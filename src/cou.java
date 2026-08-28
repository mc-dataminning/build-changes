import java.util.function.IntFunction;

public enum cou implements azc {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final IntFunction<cou> d = axq.a(cou::b, values(), axq.a.b);
   private final int e;
   private final String f;

   private cou(final int $$0, final String $$1) {
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

   public static cou a(int $$0) {
      return d.apply($$0);
   }
}
