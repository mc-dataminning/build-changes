import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxi(int d) {
   public static final cxi a = new cxi(0);
   public static final Codec<cxi> b = Codec.INT.xmap(cxi::new, cxi::a);
   public static final yx<ByteBuf, cxi> c = yv.g.a(cxi::new, cxi::a);

   public int a() {
      return this.d;
   }
}
