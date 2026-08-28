import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqq implements azt {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azt.a<bqq> e = azt.a(bqq::values);
   private static final IntFunction<bqq> f = axo.a(bqq::a, values(), axo.a.b);
   private final int g;
   private final String h;

   private bqq(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xo b() {
      return xo.c("options.difficulty." + this.h);
   }

   public xo d() {
      return xo.c("options.difficulty." + this.h + ".info");
   }

   public static bqq a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqq a(String $$0) {
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
