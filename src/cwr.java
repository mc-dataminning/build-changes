import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwr(int d) {
   public static final cwr a = new cwr(0);
   public static final Codec<cwr> b = Codec.INT.xmap(cwr::new, cwr::a);
   public static final ys<ByteBuf, cwr> c = yq.g.a(cwr::new, cwr::a);

   public int a() {
      return this.d;
   }
}
