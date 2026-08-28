import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bsh implements bai {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bai.a<bsh> e = bai.a(bsh::values);
   private static final IntFunction<bsh> f = ayd.a(bsh::a, values(), ayd.a.b);
   private final int g;
   private final String h;

   private bsh(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xj b() {
      return xj.c("options.difficulty." + this.h);
   }

   public xj d() {
      return xj.c("options.difficulty." + this.h + ".info");
   }

   public static bsh a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bsh a(String $$0) {
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
