import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwp(int d) {
   public static final cwp a = new cwp(0);
   public static final Codec<cwp> b = Codec.INT.xmap(cwp::new, cwp::a);
   public static final ys<ByteBuf, cwp> c = yq.g.a(cwp::new, cwp::a);

   public int a() {
      return this.d;
   }
}
