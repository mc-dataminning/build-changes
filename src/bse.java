import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bse implements baj {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final baj.a<bse> e = baj.a(bse::values);
   private static final IntFunction<bse> f = aye.a(bse::a, values(), aye.a.b);
   private final int g;
   private final String h;

   private bse(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xl b() {
      return xl.c("options.difficulty." + this.h);
   }

   public xl d() {
      return xl.c("options.difficulty." + this.h + ".info");
   }

   public static bse a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bse a(String $$0) {
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
