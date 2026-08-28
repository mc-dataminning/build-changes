import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum clg implements bai {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<clg> h = bai.a(clg::values);
   private static final IntFunction<clg> j = aya.a(clg::a, values(), aya.a.b);
   public static final yu<ByteBuf, clg> i = ys.a(j, clg::a);
   private final int k;
   private final String l;

   private clg(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static clg a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
