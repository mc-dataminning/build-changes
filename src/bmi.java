import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bmi implements axg {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final axg.a<bmi> e = axg.a(bmi::values);
   private static final IntFunction<bmi> f = ave.a(bmi::a, values(), ave.a.b);
   private final int g;
   private final String h;

   private bmi(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vs b() {
      return vs.c("options.difficulty." + this.h);
   }

   public vs d() {
      return vs.c("options.difficulty." + this.h + ".info");
   }

   public static bmi a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bmi a(String $$0) {
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
