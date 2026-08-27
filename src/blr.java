import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum blr implements axc {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final axc.a<blr> e = axc.a(blr::values);
   private static final IntFunction<blr> f = auz.a(blr::a, values(), auz.a.b);
   private final int g;
   private final String h;

   private blr(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vq b() {
      return vq.c("options.difficulty." + this.h);
   }

   public vq d() {
      return vq.c("options.difficulty." + this.h + ".info");
   }

   public static blr a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static blr a(String $$0) {
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
