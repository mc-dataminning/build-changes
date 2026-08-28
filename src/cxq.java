import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxq(int d) {
   public static final Codec<cxq> a = Codec.INT.xmap(cxq::new, cxq::a);
   public static final yw<ByteBuf, cxq> b = yu.f.a(cxq::new, cxq::a);
   public static final cxq c = new cxq(4603950);

   public int a() {
      return this.d;
   }
}
