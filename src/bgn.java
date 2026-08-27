import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bgn implements ash {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ash.a<bgn> e = ash.a(bgn::values);
   private static final IntFunction<bgn> f = aqk.a(bgn::a, values(), aqk.a.b);
   private final int g;
   private final String h;

   private bgn(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public tf b() {
      return tf.c("options.difficulty." + this.h);
   }

   public tf d() {
      return tf.c("options.difficulty." + this.h + ".info");
   }

   public static bgn a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bgn a(String $$0) {
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
