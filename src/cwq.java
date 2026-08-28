import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cwq implements azv {
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

   private static final IntFunction<cwq> n = axq.a(cwq::a, values(), axq.a.a);
   public static final Codec<cwq> l = azv.a(cwq::values);
   public static final yn<ByteBuf, cwq> m = yl.a(n, cwq::a);
   private final int o;
   private final String p;

   private cwq(final int $$0, final String $$1) {
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
