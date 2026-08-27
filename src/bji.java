import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bji implements aut {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final aut.a<bji> e = aut.a(bji::values);
   private static final IntFunction<bji> f = asq.a(bji::a, values(), asq.a.b);
   private final int g;
   private final String h;

   private bji(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vb b() {
      return vb.c("options.difficulty." + this.h);
   }

   public vb d() {
      return vb.c("options.difficulty." + this.h + ".info");
   }

   public static bji a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bji a(String $$0) {
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
