import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czu(int d) {
   public static final czu a = new czu(0);
   public static final Codec<czu> b = Codec.INT.xmap(czu::new, czu::a);
   public static final zt<ByteBuf, czu> c = zr.h.a(czu::new, czu::a);

   public int a() {
      return this.d;
   }
}
