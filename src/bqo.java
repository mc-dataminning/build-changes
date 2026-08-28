import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqo implements azk {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azk.a<bqo> e = azk.a(bqo::values);
   private static final IntFunction<bqo> f = axe.a(bqo::a, values(), axe.a.b);
   private final int g;
   private final String h;

   private bqo(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wz b() {
      return wz.c("options.difficulty." + this.h);
   }

   public wz d() {
      return wz.c("options.difficulty." + this.h + ".info");
   }

   public static bqo a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqo a(String $$0) {
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
