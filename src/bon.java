import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bon implements ayq {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ayq.a<bon> e = ayq.a(bon::values);
   private static final IntFunction<bon> f = awn.a(bon::a, values(), awn.a.b);
   private final int g;
   private final String h;

   private bon(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public ws b() {
      return ws.c("options.difficulty." + this.h);
   }

   public ws d() {
      return ws.c("options.difficulty." + this.h + ".info");
   }

   public static bon a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bon a(String $$0) {
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
