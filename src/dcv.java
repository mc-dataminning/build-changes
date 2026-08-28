import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dcv implements bai {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dcv> f = aya.a($$0 -> $$0.g, values(), aya.a.a);
   public static final Codec<dcv> d = bai.a(dcv::values);
   public static final yu<ByteBuf, dcv> e = ys.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private dcv(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
