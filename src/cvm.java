import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cvm implements azj {
   a(0, "common", n.p),
   b(1, "uncommon", n.o),
   c(2, "rare", n.l),
   d(3, "epic", n.n);

   public static final Codec<cvm> e = azj.b(cvm::values);
   public static final IntFunction<cvm> f = axd.a($$0 -> $$0.h, values(), axd.a.a);
   public static final yw<ByteBuf, cvm> g = yu.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final n j;

   private cvm(final int $$0, final String $$1, final n $$2) {
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
