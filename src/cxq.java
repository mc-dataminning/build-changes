import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cxq implements bba {
   a(0, "none"),
   b(1, "eat"),
   c(2, "drink"),
   d(3, "block"),
   e(4, "bow"),
   f(5, "spear"),
   g(6, "crossbow"),
   h(7, "spyglass"),
   i(8, "toot_horn"),
   j(9, "brush");

   private static final IntFunction<cxq> m = ayv.a(cxq::a, values(), ayv.a.a);
   public static final Codec<cxq> k = bba.a(cxq::values);
   public static final zt<ByteBuf, cxq> l = zr.a(m, cxq::a);
   private final int n;
   private final String o;

   private cxq(final int $$0, final String $$1) {
      this.n = $$0;
      this.o = $$1;
   }

   public int a() {
      return this.n;
   }

   @Override
   public String c() {
      return this.o;
   }
}
