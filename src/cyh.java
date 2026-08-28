import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyh implements bba {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<cyh> e = bba.b(cyh::values);
   public static final IntFunction<cyh> f = ayv.a($$0 -> $$0.h, values(), ayv.a.a);
   public static final zt<ByteBuf, cyh> g = zr.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private cyh(final int $$0, final String $$1, final n $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public n a() {
      return this.j;
   }

   @Override
   public String c() {
      return this.i;
   }
}
