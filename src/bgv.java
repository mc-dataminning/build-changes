import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bgv implements asp {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final asp.a<bgv> e = asp.a(bgv::values);
   private static final IntFunction<bgv> f = aqr.a(bgv::a, values(), aqr.a.b);
   private final int g;
   private final String h;

   private bgv(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public tl b() {
      return tl.c("options.difficulty." + this.h);
   }

   public tl d() {
      return tl.c("options.difficulty." + this.h + ".info");
   }

   public static bgv a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bgv a(String $$0) {
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
