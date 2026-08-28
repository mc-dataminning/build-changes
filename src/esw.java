import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record esw(int c) {
   public static final Codec<esw> a = Codec.INT.xmap(esw::new, esw::b);
   public static final zf<ByteBuf, esw> b = zd.h.a(esw::new, esw::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
