import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqp implements azs {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azs.a<bqp> e = azs.a(bqp::values);
   private static final IntFunction<bqp> f = axo.a(bqp::a, values(), axo.a.b);
   private final int g;
   private final String h;

   private bqp(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xo b() {
      return xo.c("options.difficulty." + this.h);
   }

   public xo d() {
      return xo.c("options.difficulty." + this.h + ".info");
   }

   public static bqp a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqp a(String $$0) {
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
