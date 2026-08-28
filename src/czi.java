import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czi(int d) {
   public static final Codec<czi> a = Codec.INT.xmap(czi::new, czi::a);
   public static final zh<ByteBuf, czi> b = zf.g.a(czi::new, czi::a);
   public static final czi c = new czi(4603950);

   public int a() {
      return this.d;
   }
}
