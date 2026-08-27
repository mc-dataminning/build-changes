import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum boc implements ayg {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ayg.a<boc> e = ayg.a(boc::values);
   private static final IntFunction<boc> f = awd.a(boc::a, values(), awd.a.b);
   private final int g;
   private final String h;

   private boc(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wi b() {
      return wi.c("options.difficulty." + this.h);
   }

   public wi d() {
      return wi.c("options.difficulty." + this.h + ".info");
   }

   public static boc a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static boc a(String $$0) {
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
