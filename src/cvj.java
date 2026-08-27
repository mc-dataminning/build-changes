import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cvj implements azg {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n),
   e(4, "potato", n.k);

   public static final Codec<cvj> f = azg.b(cvj::values);
   public static final IntFunction<cvj> g = axd.a($$0 -> $$0.i, values(), axd.a.a);
   public static final zc<ByteBuf, cvj> h = za.a(g, $$0 -> $$0.i);
   private final int i;
   private final String j;
   private final n k;

   private cvj(int $$0, String $$1, n $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   public n a() {
      return this.k;
   }

   @Override
   public String c() {
      return this.j;
   }
}
