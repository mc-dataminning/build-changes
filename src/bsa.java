import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bsa implements bag {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bag.a<bsa> e = bag.a(bsa::values);
   private static final IntFunction<bsa> f = ayb.a(bsa::a, values(), ayb.a.b);
   private final int g;
   private final String h;

   private bsa(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xi b() {
      return xi.c("options.difficulty." + this.h);
   }

   public xi d() {
      return xi.c("options.difficulty." + this.h + ".info");
   }

   public static bsa a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bsa a(String $$0) {
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
