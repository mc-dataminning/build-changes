import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqs implements azu {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azu.a<bqs> e = azu.a(bqs::values);
   private static final IntFunction<bqs> f = axp.a(bqs::a, values(), axp.a.b);
   private final int g;
   private final String h;

   private bqs(final int $$0, final String $$1) {
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

   public static bqs a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqs a(String $$0) {
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
