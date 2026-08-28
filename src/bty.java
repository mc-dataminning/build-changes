import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bty implements bak {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bak.a<bty> e = bak.a(bty::values);
   private static final IntFunction<bty> f = ayc.a(bty::a, values(), ayc.a.b);
   private final int g;
   private final String h;

   private bty(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wy b() {
      return wy.c("options.difficulty." + this.h);
   }

   public wy d() {
      return wy.c("options.difficulty." + this.h + ".info");
   }

   public static bty a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bty a(String $$0) {
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
