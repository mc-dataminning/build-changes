import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bgq implements ask {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ask.a<bgq> e = ask.a(bgq::values);
   private static final IntFunction<bgq> f = aqn.a(bgq::a, values(), aqn.a.b);
   private final int g;
   private final String h;

   private bgq(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public ti b() {
      return ti.c("options.difficulty." + this.h);
   }

   public ti d() {
      return ti.c("options.difficulty." + this.h + ".info");
   }

   public static bgq a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bgq a(String $$0) {
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
