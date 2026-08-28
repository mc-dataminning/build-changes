import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dao implements azu {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dao> f = axp.a($$0 -> $$0.g, values(), axp.a.a);
   public static final Codec<dao> d = azu.a(dao::values);
   public static final ym<ByteBuf, dao> e = yk.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private dao(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
