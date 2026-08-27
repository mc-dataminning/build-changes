import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum crv implements axc {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<crv> e = axc.a(crv::values);
   public static final IntFunction<crv> f = ava.a(crv::a, values(), ava.a.a);
   public static final xo<ByteBuf, crv> g = xm.a(f, crv::a);
   private final String h;
   private final int i;

   private crv(String $$0, int $$1) {
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
