import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwz(int d) {
   public static final Codec<cwz> a = Codec.INT.xmap(cwz::new, cwz::a);
   public static final ys<ByteBuf, cwz> b = yq.f.a(cwz::new, cwz::a);
   public static final cwz c = new cwz(4603950);

   public int a() {
      return this.d;
   }
}
