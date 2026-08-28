import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbr implements bba {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dbr> e = bba.a(dbr::values);
   public static final IntFunction<dbr> f = ayv.a(dbr::a, values(), ayv.a.a);
   public static final zt<ByteBuf, dbr> g = zr.a(f, dbr::a);
   private final String h;
   private final int i;

   private dbr(final String $$0, final int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   private int a() {
      return this.i;
   }
}
