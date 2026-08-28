import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bqn implements azj {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final azj.a<bqn> e = azj.a(bqn::values);
   private static final IntFunction<bqn> f = axd.a(bqn::a, values(), axd.a.b);
   private final int g;
   private final String h;

   private bqn(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wy b() {
      return wy.c("options.difficulty." + this.h);
   }

   public wy d() {
      return wy.c("options.difficulty." + this.h + ".info");
   }

   public static bqn a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bqn a(String $$0) {
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
