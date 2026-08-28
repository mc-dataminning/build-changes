import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cux implements azc {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<cux> e = azc.b(cux::values);
   public static final IntFunction<cux> f = aww.a($$0 -> $$0.h, values(), aww.a.a);
   public static final ys<ByteBuf, cux> g = yq.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private cux(final int $$0, final String $$1, final n $$2) {
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
