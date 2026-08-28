import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum brv implements baf {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final baf.a<brv> e = baf.a(brv::values);
   private static final IntFunction<brv> f = aya.a(brv::a, values(), aya.a.b);
   private final int g;
   private final String h;

   private brv(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xh b() {
      return xh.c("options.difficulty." + this.h);
   }

   public xh d() {
      return xh.c("options.difficulty." + this.h + ".info");
   }

   public static brv a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static brv a(String $$0) {
      return e.a($$0);
   }

   public String e() {
      return this.h;
   }

   @Override
   public String c() {
      return this.h;
   }
}
