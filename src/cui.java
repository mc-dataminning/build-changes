import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cui implements ayx {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<cui> e = ayx.b(cui::values);
   public static final IntFunction<cui> f = awv.a($$0 -> $$0.h, values(), awv.a.a);
   public static final yv<ByteBuf, cui> g = yt.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private cui(int $$0, String $$1, n $$2) {
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
