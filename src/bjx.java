import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bjx implements avj {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final avj.a<bjx> e = avj.a(bjx::values);
   private static final IntFunction<bjx> f = atf.a(bjx::a, values(), atf.a.b);
   private final int g;
   private final String h;

   private bjx(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vf b() {
      return vf.c("options.difficulty." + this.h);
   }

   public vf d() {
      return vf.c("options.difficulty." + this.h + ".info");
   }

   public static bjx a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bjx a(String $$0) {
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
