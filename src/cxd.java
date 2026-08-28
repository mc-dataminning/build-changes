import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxd(int d) {
   public static final cxd a = new cxd(0);
   public static final Codec<cxd> b = Codec.INT.xmap(cxd::new, cxd::a);
   public static final zm<ByteBuf, cxd> c = zk.g.a(cxd::new, cxd::a);

   public int a() {
      return this.d;
   }
}
