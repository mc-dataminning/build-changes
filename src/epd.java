import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epd(int c) {
   public static final Codec<epd> a = Codec.INT.xmap(epd::new, epd::b);
   public static final zj<ByteBuf, epd> b = zh.g.a(epd::new, epd::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
