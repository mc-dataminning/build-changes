import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epw(int c) {
   public static final Codec<epw> a = Codec.INT.xmap(epw::new, epw::b);
   public static final ys<ByteBuf, epw> b = yq.g.a(epw::new, epw::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
