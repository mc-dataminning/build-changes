import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum buz implements bax {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bax.a<buz> e = bax.a(buz::values);
   private static final IntFunction<buz> f = ayo.a(buz::a, values(), ayo.a.b);
   private final int g;
   private final String h;

   private buz(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xg b() {
      return xg.c("options.difficulty." + this.h);
   }

   public xg d() {
      return xg.c("options.difficulty." + this.h + ".info");
   }

   public static buz a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static buz a(String $$0) {
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
