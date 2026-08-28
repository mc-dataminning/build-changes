import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum daa implements bam {
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

   private static final IntFunction<daa> n = aye.a(daa::a, values(), aye.a.a);
   public static final Codec<daa> l = bam.a(daa::values);
   public static final yy<ByteBuf, daa> m = yw.a(n, daa::a);
   private final int o;
   private final String p;

   private daa(final int $$0, final String $$1) {
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
