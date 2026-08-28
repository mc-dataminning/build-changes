import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum ciq implements bab {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<ciq> h = bab.a(ciq::values);
   private static final IntFunction<ciq> i = axw.a(ciq::a, values(), axw.a.b);
   private final int j;
   private final String k;

   private ciq(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public int a() {
      return this.j;
   }

   public static ciq a(int $$0) {
      return i.apply($$0);
   }

   @Override
   public String c() {
      return this.k;
   }
}
