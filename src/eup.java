import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eup(int c) {
   public static final Codec<eup> a = Codec.INT.xmap(eup::new, eup::b);
   public static final ym<ByteBuf, eup> b = yk.h.a(eup::new, eup::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
