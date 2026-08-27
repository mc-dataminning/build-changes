import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum biy implements auk {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final auk.a<biy> e = auk.a(biy::values);
   private static final IntFunction<biy> f = asj.a(biy::a, values(), asj.a.b);
   private final int g;
   private final String h;

   private biy(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public uv b() {
      return uv.c("options.difficulty." + this.h);
   }

   public uv d() {
      return uv.c("options.difficulty." + this.h + ".info");
   }

   public static biy a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static biy a(String $$0) {
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
