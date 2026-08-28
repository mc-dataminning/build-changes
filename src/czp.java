import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum czp implements bak {
   a(0, "none"),
   b(1, "eat"),
   c(2, "drink"),
   d(3, "block"),
   e(4, "bow"),
   f(5, "spear"),
   g(6, "crossbow"),
   h(7, "spyglass"),
   i(8, "toot_horn"),
   j(9, "brush"),
   k(10, "bundle");

   private static final IntFunction<czp> n = ayc.a(czp::a, values(), ayc.a.a);
   public static final Codec<czp> l = bak.a(czp::values);
   public static final yw<ByteBuf, czp> m = yu.a(n, czp::a);
   private final int o;
   private final String p;

   private czp(final int $$0, final String $$1) {
      this.o = $$0;
      this.p = $$1;
   }

   public int a() {
      return this.o;
   }

   @Override
   public String c() {
      return this.p;
   }
}
