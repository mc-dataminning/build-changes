import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwq(int d) {
   public static final Codec<cwq> a = Codec.INT.xmap(cwq::new, cwq::a);
   public static final yv<ByteBuf, cwq> b = yt.e.a(cwq::new, cwq::a);
   public static final cwq c = new cwq(4603950);

   public int a() {
      return this.d;
   }
}
