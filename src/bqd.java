import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqd implements azc {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azc.a<bqd> e = azc.a(bqd::values);
   private static final IntFunction<bqd> f = aww.a(bqd::a, values(), aww.a.b);
   private final int g;
   private final String h;

   private bqd(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wu b() {
      return wu.c("options.difficulty." + this.h);
   }

   public wu d() {
      return wu.c("options.difficulty." + this.h + ".info");
   }

   public static bqd a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqd a(String $$0) {
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
