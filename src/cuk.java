import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cuk implements ayz {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<cuk> e = ayz.b(cuk::values);
   public static final IntFunction<cuk> f = aww.a($$0 -> $$0.h, values(), aww.a.a);
   public static final yv<ByteBuf, cuk> g = yt.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private cuk(int $$0, String $$1, n $$2) {
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
