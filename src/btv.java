import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum btv implements bai {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bai.a<btv> e = bai.a(btv::values);
   private static final IntFunction<btv> f = aya.a(btv::a, values(), aya.a.b);
   private final int g;
   private final String h;

   private btv(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public ww b() {
      return ww.c("options.difficulty." + this.h);
   }

   public ww d() {
      return ww.c("options.difficulty." + this.h + ".info");
   }

   public static btv a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static btv a(String $$0) {
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
