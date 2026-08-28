import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum czu implements bak {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<czu> e = bak.b(czu::values);
   public static final IntFunction<czu> f = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
   public static final yw<ByteBuf, czu> g = yu.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private czu(final int $$0, final String $$1, final n $$2) {
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
