import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bjy implements avk {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final avk.a<bjy> e = avk.a(bjy::values);
   private static final IntFunction<bjy> f = atg.a(bjy::a, values(), atg.a.b);
   private final int g;
   private final String h;

   private bjy(int $$0, String $$1) {
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

   public static bjy a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bjy a(String $$0) {
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
