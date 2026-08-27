import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bpx implements azg {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azg.a<bpx> e = azg.a(bpx::values);
   private static final IntFunction<bpx> f = axd.a(bpx::a, values(), axd.a.b);
   private final int g;
   private final String h;

   private bpx(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xe b() {
      return xe.c("options.difficulty." + this.h);
   }

   public xe d() {
      return xe.c("options.difficulty." + this.h + ".info");
   }

   public static bpx a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bpx a(String $$0) {
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
