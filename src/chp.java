import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum chp implements azj {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<chp> h = azj.a(chp::values);
   private static final IntFunction<chp> i = axd.a(chp::a, values(), axd.a.b);
   private final int j;
   private final String k;

   private chp(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public int a() {
      return this.j;
   }

   public static chp a(int $$0) {
      return i.apply($$0);
   }

   @Override
   public String c() {
      return this.k;
   }
}
