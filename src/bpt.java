import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bpt implements ayz {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ayz.a<bpt> e = ayz.a(bpt::values);
   private static final IntFunction<bpt> f = aww.a(bpt::a, values(), aww.a.b);
   private final int g;
   private final String h;

   private bpt(int $$0, String $$1) {
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

   public static bpt a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bpt a(String $$0) {
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
