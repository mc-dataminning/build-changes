import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbh implements azv {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dbh> f = axq.a($$0 -> $$0.g, values(), axq.a.a);
   public static final Codec<dbh> d = azv.a(dbh::values);
   public static final yn<ByteBuf, dbh> e = yl.a(f, $$0 -> $$0.g);
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
