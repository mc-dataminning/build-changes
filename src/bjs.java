import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bjs implements ave {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ave.a<bjs> e = ave.a(bjs::values);
   private static final IntFunction<bjs> f = ata.a(bjs::a, values(), ata.a.b);
   private final int g;
   private final String h;

   private bjs(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public vd b() {
      return vd.c("options.difficulty." + this.h);
   }

   public vd d() {
      return vd.c("options.difficulty." + this.h + ".info");
   }

   public static bjs a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bjs a(String $$0) {
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
