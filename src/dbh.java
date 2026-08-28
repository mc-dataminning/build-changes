import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbh implements baq {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dbh> f = ayl.a($$0 -> $$0.g, values(), ayl.a.a);
   public static final Codec<dbh> d = baq.a(dbh::values);
   public static final zi<ByteBuf, dbh> e = zg.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private dbh(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
