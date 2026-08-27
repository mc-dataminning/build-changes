import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bwq implements asf {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<bwq> h = asf.a(bwq::values);
   private static final IntFunction<bwq> i = aqi.a(bwq::a, values(), aqi.a.b);
   private final int j;
   private final String k;

   private bwq(int $$0, String $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public int a() {
      return this.j;
   }

   public static bwq a(int $$0) {
      return i.apply($$0);
   }

   @Override
   public String c() {
      return this.k;
   }
}
