import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum btf implements bba {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bba.a<btf> e = bba.a(btf::values);
   private static final IntFunction<btf> f = ayv.a(btf::a, values(), ayv.a.b);
   private final int g;
   private final String h;

   private btf(final int $$0, final String $$1) {
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

   public static btf a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static btf a(String $$0) {
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
