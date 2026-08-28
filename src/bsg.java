import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bsg implements azv {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azv.a<bsg> e = azv.a(bsg::values);
   private static final IntFunction<bsg> f = axq.a(bsg::a, values(), axq.a.b);
   private final int g;
   private final String h;

   private bsg(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wp b() {
      return wp.c("options.difficulty." + this.h);
   }

   public wp d() {
      return wp.c("options.difficulty." + this.h + ".info");
   }

   public static bsg a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bsg a(String $$0) {
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
