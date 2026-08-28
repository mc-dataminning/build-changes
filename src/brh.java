import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum brh implements azy {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azy.a<brh> e = azy.a(brh::values);
   private static final IntFunction<brh> f = axt.a(brh::a, values(), axt.a.b);
   private final int g;
   private final String h;

   private brh(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xd b() {
      return xd.c("options.difficulty." + this.h);
   }

   public xd d() {
      return xd.c("options.difficulty." + this.h + ".info");
   }

   public static brh a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static brh a(String $$0) {
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
