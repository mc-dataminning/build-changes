import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cme implements bao {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<cme> h = bao.a(cme::values);
   private static final IntFunction<cme> j = ayg.a(cme::a, values(), ayg.a.b);
   public static final za<ByteBuf, cme> i = yy.a(j, cme::a);
   private final int k;
   private final String l;

   private cme(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static cme a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
