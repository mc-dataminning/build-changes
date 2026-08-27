import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bwz implements asp {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<bwz> h = asp.a(bwz::values);
   private static final IntFunction<bwz> i = aqr.a(bwz::a, values(), aqr.a.b);
   private final int j;
   private final String k;

   private bwz(int $$0, String $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public int a() {
      return this.j;
   }

   public static bwz a(int $$0) {
      return i.apply($$0);
   }

   @Override
   public String c() {
      return this.k;
   }
}
