import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqm implements azp {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azp.a<bqm> e = azp.a(bqm::values);
   private static final IntFunction<bqm> f = axl.a(bqm::a, values(), axl.a.b);
   private final int g;
   private final String h;

   private bqm(final int $$0, final String $$1) {
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

   public static bqm a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqm a(String $$0) {
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
