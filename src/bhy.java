import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bhy implements atr {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final atr.a<bhy> e = atr.a(bhy::values);
   private static final IntFunction<bhy> f = arr.a(bhy::a, values(), arr.a.b);
   private final int g;
   private final String h;

   private bhy(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public ui b() {
      return ui.c("options.difficulty." + this.h);
   }

   public ui d() {
      return ui.c("options.difficulty." + this.h + ".info");
   }

   public static bhy a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bhy a(String $$0) {
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
