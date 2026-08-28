import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dcw(int d) {
   public static final Codec<dcw> a = Codec.INT.xmap(dcw::new, dcw::a);
   public static final za<ByteBuf, dcw> b = yy.g.a(dcw::new, dcw::a);
   public static final dcw c = new dcw(4603950);

   public int a() {
      return this.d;
   }
}
