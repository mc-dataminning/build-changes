import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum clu implements bak {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<clu> h = bak.a(clu::values);
   private static final IntFunction<clu> j = ayc.a(clu::a, values(), ayc.a.b);
   public static final yw<ByteBuf, clu> i = yu.a(j, clu::a);
   private final int k;
   private final String l;

   private clu(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static clu a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
