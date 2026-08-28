import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record evh(int c) {
   public static final Codec<evh> a = Codec.INT.xmap(evh::new, evh::b);
   public static final zt<ByteBuf, evh> b = zr.h.a(evh::new, evh::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
