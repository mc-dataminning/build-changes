import java.util.function.IntFunction;

public enum fdj implements ayf {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fdj> d = awv.a(fdj::a, values(), awv.a.b);
   private final int e;
   private final String f;

   private fdj(int $$0, String $$1) {
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

   public static fdj a(int $$0) {
      return d.apply($$0);
   }
}
