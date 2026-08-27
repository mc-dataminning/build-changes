import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bnx implements aye {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final aye.a<bnx> e = aye.a(bnx::values);
   private static final IntFunction<bnx> f = awb.a(bnx::a, values(), awb.a.b);
   private final int g;
   private final String h;

   private bnx(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wg b() {
      return wg.c("options.difficulty." + this.h);
   }

   public wg d() {
      return wg.c("options.difficulty." + this.h + ".info");
   }

   public static bnx a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bnx a(String $$0) {
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
