import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum den implements bax {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<den> f = ayo.a($$0 -> $$0.g, values(), ayo.a.a);
   public static final Codec<den> d = bax.a(den::values);
   public static final ze<ByteBuf, den> e = zc.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private den(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
