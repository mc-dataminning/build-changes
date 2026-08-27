import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bdu implements apr {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final apr.a<bdu> e = apr.a(bdu::values);
   private static final IntFunction<bdu> f = anu.a(bdu::a, values(), anu.a.b);
   private final int g;
   private final String h;

   private bdu(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public sw b() {
      return sw.c("options.difficulty." + this.h);
   }

   public sw d() {
      return sw.c("options.difficulty." + this.h + ".info");
   }

   public static bdu a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bdu a(String $$0) {
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
