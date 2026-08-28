import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxo(int d) {
   public static final Codec<cxo> a = Codec.INT.xmap(cxo::new, cxo::a);
   public static final zm<ByteBuf, cxo> b = zk.f.a(cxo::new, cxo::a);
   public static final cxo c = new cxo(4603950);

   public int a() {
      return this.d;
   }
}
