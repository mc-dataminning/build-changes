import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cvz implements baf {
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

   private static final IntFunction<cvz> m = aya.a(cvz::a, values(), aya.a.a);
   public static final Codec<cvz> k = baf.a(cvz::values);
   public static final zf<ByteBuf, cvz> l = zd.a(m, cvz::a);
   private final int n;
   private final String o;

   private cvz(final int $$0, final String $$1) {
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
