import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyj implements azs {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyj> e = azs.a(cyj::values);
   public static final IntFunction<cyj> f = axo.a(cyj::a, values(), axo.a.a);
   public static final zm<ByteBuf, cyj> g = zk.a(f, cyj::a);
   private final String h;
   private final int i;

   private cyj(final String $$0, final int $$1) {
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
