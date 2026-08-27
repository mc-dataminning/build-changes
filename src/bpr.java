import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bpr implements ayx {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ayx.a<bpr> e = ayx.a(bpr::values);
   private static final IntFunction<bpr> f = awv.a(bpr::a, values(), awv.a.b);
   private final int g;
   private final String h;

   private bpr(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wx b() {
      return wx.c("options.difficulty." + this.h);
   }

   public wx d() {
      return wx.c("options.difficulty." + this.h + ".info");
   }

   public static bpr a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bpr a(String $$0) {
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
