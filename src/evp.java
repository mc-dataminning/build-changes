import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record evp(int c) {
   public static final Codec<evp> a = Codec.INT.xmap(evp::new, evp::b);
   public static final zt<ByteBuf, evp> b = zr.h.a(evp::new, evp::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
