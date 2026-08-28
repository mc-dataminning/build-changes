import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dam implements bax {
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

   private static final IntFunction<dam> n = ayo.a(dam::a, values(), ayo.a.a);
   public static final Codec<dam> l = bax.a(dam::values);
   public static final ze<ByteBuf, dam> m = zc.a(n, dam::a);
   private final int o;
   private final String p;

   private dam(final int $$0, final String $$1) {
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
