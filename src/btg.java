import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum btg implements bba {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bba.a<btg> e = bba.a(btg::values);
   private static final IntFunction<btg> f = ayv.a(btg::a, values(), ayv.a.b);
   private final int g;
   private final String h;

   private btg(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xv b() {
      return xv.c("options.difficulty." + this.h);
   }

   public xv d() {
      return xv.c("options.difficulty." + this.h + ".info");
   }

   public static btg a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static btg a(String $$0) {
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
