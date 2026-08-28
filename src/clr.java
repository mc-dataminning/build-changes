import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum clr implements bak {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<clr> h = bak.a(clr::values);
   private static final IntFunction<clr> j = ayc.a(clr::a, values(), ayc.a.b);
   public static final yw<ByteBuf, clr> i = yu.a(j, clr::a);
   private final int k;
   private final String l;

   private clr(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static clr a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
