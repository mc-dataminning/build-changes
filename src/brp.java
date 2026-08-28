import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum brp implements bab {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bab.a<brp> e = bab.a(brp::values);
   private static final IntFunction<brp> f = axw.a(brp::a, values(), axw.a.b);
   private final int g;
   private final String h;

   private brp(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xe b() {
      return xe.c("options.difficulty." + this.h);
   }

   public xe d() {
      return xe.c("options.difficulty." + this.h + ".info");
   }

   public static brp a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static brp a(String $$0) {
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
