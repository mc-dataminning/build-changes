import java.util.function.IntFunction;

public enum exu implements awo {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<exu> d = ave.a(exu::a, values(), ave.a.b);
   private final int e;
   private final String f;

   private exu(int $$0, String $$1) {
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

   public static exu a(int $$0) {
      return d.apply($$0);
   }
}
