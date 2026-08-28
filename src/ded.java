import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ded implements bao {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<ded> f = ayg.a($$0 -> $$0.g, values(), ayg.a.a);
   public static final Codec<ded> d = bao.a(ded::values);
   public static final za<ByteBuf, ded> e = yy.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private ded(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
