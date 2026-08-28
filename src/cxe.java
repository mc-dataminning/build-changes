import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxe(int d) {
   public static final cxe a = new cxe(0);
   public static final Codec<cxe> b = Codec.INT.xmap(cxe::new, cxe::a);
   public static final zm<ByteBuf, cxe> c = zk.g.a(cxe::new, cxe::a);

   public int a() {
      return this.d;
   }
}
