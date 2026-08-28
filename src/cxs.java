import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxs(int d) {
   public static final Codec<cxs> a = Codec.INT.xmap(cxs::new, cxs::a);
   public static final yx<ByteBuf, cxs> b = yv.f.a(cxs::new, cxs::a);
   public static final cxs c = new cxs(4603950);

   public int a() {
      return this.d;
   }
}
