import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bsx implements baq {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final baq.a<bsx> e = baq.a(bsx::values);
   private static final IntFunction<bsx> f = ayl.a(bsx::a, values(), ayl.a.b);
   private final int g;
   private final String h;

   private bsx(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xk b() {
      return xk.c("options.difficulty." + this.h);
   }

   public xk d() {
      return xk.c("options.difficulty." + this.h + ".info");
   }

   public static bsx a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bsx a(String $$0) {
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
