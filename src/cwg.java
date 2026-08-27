import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwg(int d) {
   public static final cwg a = new cwg(0);
   public static final Codec<cwg> b = Codec.INT.xmap(cwg::new, cwg::a);
   public static final yv<ByteBuf, cwg> c = yt.f.a(cwg::new, cwg::a);

   public int a() {
      return this.d;
   }
}
