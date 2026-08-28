import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum ckb implements baq {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<ckb> h = baq.a(ckb::values);
   private static final IntFunction<ckb> i = ayl.a(ckb::a, values(), ayl.a.b);
   private final int j;
   private final String k;

   private ckb(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public int a() {
      return this.j;
   }

   public static ckb a(int $$0) {
      return i.apply($$0);
   }

   @Override
   public String c() {
      return this.k;
   }
}
