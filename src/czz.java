import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czz(int d) {
   public static final czz a = new czz(0);
   public static final Codec<czz> b = Codec.INT.xmap(czz::new, czz::a);
   public static final zt<ByteBuf, czz> c = zr.h.a(czz::new, czz::a);

   public int a() {
      return this.d;
   }
}
