import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqr implements azu {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azu.a<bqr> e = azu.a(bqr::values);
   private static final IntFunction<bqr> f = axp.a(bqr::a, values(), axp.a.b);
   private final int g;
   private final String h;

   private bqr(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xp b() {
      return xp.c("options.difficulty." + this.h);
   }

   public xp d() {
      return xp.c("options.difficulty." + this.h + ".info");
   }

   public static bqr a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqr a(String $$0) {
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
