import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bsf implements azu {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azu.a<bsf> e = azu.a(bsf::values);
   private static final IntFunction<bsf> f = axp.a(bsf::a, values(), axp.a.b);
   private final int g;
   private final String h;

   private bsf(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wo b() {
      return wo.c("options.difficulty." + this.h);
   }

   public wo d() {
      return wo.c("options.difficulty." + this.h + ".info");
   }

   public static bsf a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bsf a(String $$0) {
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
