import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ddq implements bak {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<ddq> f = ayc.a($$0 -> $$0.g, values(), ayc.a.a);
   public static final Codec<ddq> d = bak.a(ddq::values);
   public static final yw<ByteBuf, ddq> e = yu.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private ddq(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
