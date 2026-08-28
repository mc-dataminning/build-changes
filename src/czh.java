import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum czh implements azy {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<czh> e = azy.a(czh::values);
   public static final IntFunction<czh> f = axt.a(czh::a, values(), axt.a.a);
   public static final zb<ByteBuf, czh> g = yz.a(f, czh::a);
   private final String h;
   private final int i;

   private czh(final String $$0, final int $$1) {
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
