import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bin implements aub {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final aub.a<bin> e = aub.a(bin::values);
   private static final IntFunction<bin> f = asb.a(bin::a, values(), asb.a.b);
   private final int g;
   private final String h;

   private bin(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public ur b() {
      return ur.c("options.difficulty." + this.h);
   }

   public ur d() {
      return ur.c("options.difficulty." + this.h + ".info");
   }

   public static bin a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bin a(String $$0) {
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
