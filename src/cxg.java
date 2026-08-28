import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxg(int d) {
   public static final cxg a = new cxg(0);
   public static final Codec<cxg> b = Codec.INT.xmap(cxg::new, cxg::a);
   public static final zn<ByteBuf, cxg> c = zl.g.a(cxg::new, cxg::a);

   public int a() {
      return this.d;
   }
}
