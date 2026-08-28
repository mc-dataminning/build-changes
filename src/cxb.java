import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxb(int d) {
   public static final Codec<cxb> a = Codec.INT.xmap(cxb::new, cxb::a);
   public static final ys<ByteBuf, cxb> b = yq.f.a(cxb::new, cxb::a);
   public static final cxb c = new cxb(4603950);

   public int a() {
      return this.d;
   }
}
