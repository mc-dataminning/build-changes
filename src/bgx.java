import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bgx implements asr {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final asr.a<bgx> e = asr.a(bgx::values);
   private static final IntFunction<bgx> f = aqt.a(bgx::a, values(), aqt.a.b);
   private final int g;
   private final String h;

   private bgx(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public tn b() {
      return tn.c("options.difficulty." + this.h);
   }

   public tn d() {
      return tn.c("options.difficulty." + this.h + ".info");
   }

   public static bgx a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bgx a(String $$0) {
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
