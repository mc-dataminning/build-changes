import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxc(int d) {
   public static final Codec<cxc> a = Codec.INT.xmap(cxc::new, cxc::a);
   public static final ys<ByteBuf, cxc> b = yq.f.a(cxc::new, cxc::a);
   public static final cxc c = new cxc(4603950);

   public int a() {
      return this.d;
   }
}
