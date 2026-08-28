import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record ddg(int d) {
   public static final Codec<ddg> a = Codec.INT.xmap(ddg::new, ddg::a);
   public static final ze<ByteBuf, ddg> b = zc.g.a(ddg::new, ddg::a);
   public static final ddg c = new ddg(4603950);

   public int a() {
      return this.d;
   }
}
