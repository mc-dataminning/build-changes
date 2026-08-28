import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bua implements bak {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bak.a<bua> e = bak.a(bua::values);
   private static final IntFunction<bua> f = ayc.a(bua::a, values(), ayc.a.b);
   private final int g;
   private final String h;

   private bua(final int $$0, final String $$1) {
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

   public static bua a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bua a(String $$0) {
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
