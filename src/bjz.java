import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bjz implements avl {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final avl.a<bjz> e = avl.a(bjz::values);
   private static final IntFunction<bjz> f = ath.a(bjz::a, values(), ath.a.b);
   private final int g;
   private final String h;

   private bjz(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vg b() {
      return vg.c("options.difficulty." + this.h);
   }

   public vg d() {
      return vg.c("options.difficulty." + this.h + ".info");
   }

   public static bjz a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bjz a(String $$0) {
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
