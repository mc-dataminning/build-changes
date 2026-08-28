import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbq implements bba {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dbq> f = ayv.a($$0 -> $$0.g, values(), ayv.a.a);
   public static final Codec<dbq> d = bba.a(dbq::values);
   public static final zt<ByteBuf, dbq> e = zr.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private dbq(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
