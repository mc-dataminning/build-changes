import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum clm implements bak {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<clm> h = bak.a(clm::values);
   private static final IntFunction<clm> j = ayc.a(clm::a, values(), ayc.a.b);
   public static final yw<ByteBuf, clm> i = yu.a(j, clm::a);
   private final int k;
   private final String l;

   private clm(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static clm a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
