import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum blt implements axc {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final axc.a<blt> e = axc.a(blt::values);
   private static final IntFunction<blt> f = ava.a(blt::a, values(), ava.a.b);
   private final int g;
   private final String h;

   private blt(int $$0, String $$1) {
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

   public static blt a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static blt a(String $$0) {
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
