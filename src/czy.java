import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czy(int d) {
   public static final czy a = new czy(0);
   public static final Codec<czy> b = Codec.INT.xmap(czy::new, czy::a);
   public static final zt<ByteBuf, czy> c = zr.h.a(czy::new, czy::a);

   public int a() {
      return this.d;
   }
}
