import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxp(int d) {
   public static final Codec<cxp> a = Codec.INT.xmap(cxp::new, cxp::a);
   public static final zn<ByteBuf, cxp> b = zl.f.a(cxp::new, cxp::a);
   public static final cxp c = new cxp(4603950);

   public int a() {
      return this.d;
   }
}
