import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cvb(int d) {
   public static final Codec<cvb> a = Codec.INT.xmap(cvb::new, cvb::a);
   public static final yq<ByteBuf, cvb> b = yo.e.a(cvb::new, cvb::a);
   public static final cvb c = new cvb(4603950);

   public int a() {
      return this.d;
   }
}
