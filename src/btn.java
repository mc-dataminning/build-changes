import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum btn implements bag {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bag.a<btn> e = bag.a(btn::values);
   private static final IntFunction<btn> f = aya.a(btn::a, values(), aya.a.b);
   private final int g;
   private final String h;

   private btn(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wv b() {
      return wv.c("options.difficulty." + this.h);
   }

   public wv d() {
      return wv.c("options.difficulty." + this.h + ".info");
   }

   public static btn a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static btn a(String $$0) {
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
