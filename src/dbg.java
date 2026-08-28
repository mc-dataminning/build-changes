import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbg implements bax {
   a(0, "common", o.p),
   b(1, "uncommon", o.o),
   c(2, "rare", o.l),
   d(3, "epic", o.n);

   public static final Codec<dbg> e = bax.b(dbg::values);
   public static final IntFunction<dbg> f = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
   public static final ze<ByteBuf, dbg> g = zc.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final o j;

   private dbg(final int $$0, final String $$1, final o $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public o a() {
      return this.j;
   }

   @Override
   public String c() {
      return this.i;
   }
}
