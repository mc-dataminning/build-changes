import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum buq implements bao {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bao.a<buq> e = bao.a(buq::values);
   private static final IntFunction<buq> f = ayg.a(buq::a, values(), ayg.a.b);
   private final int g;
   private final String h;

   private buq(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xc b() {
      return xc.c("options.difficulty." + this.h);
   }

   public xc d() {
      return xc.c("options.difficulty." + this.h + ".info");
   }

   public static buq a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static buq a(String $$0) {
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
