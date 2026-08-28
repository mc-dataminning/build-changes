import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum brm implements azz {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azz.a<brm> e = azz.a(brm::values);
   private static final IntFunction<brm> f = axu.a(brm::a, values(), axu.a.b);
   private final int g;
   private final String h;

   private brm(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xd b() {
      return xd.c("options.difficulty." + this.h);
   }

   public xd d() {
      return xd.c("options.difficulty." + this.h + ".info");
   }

   public static brm a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static brm a(String $$0) {
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
