import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dcg(int d) {
   public static final Codec<dcg> a = Codec.INT.xmap(dcg::new, dcg::a);
   public static final yw<ByteBuf, dcg> b = yu.g.a(dcg::new, dcg::a);
   public static final dcg c = new dcg(4603950);

   public int a() {
      return this.d;
   }
}
