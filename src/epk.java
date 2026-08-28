import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epk(int c) {
   public static final Codec<epk> a = Codec.INT.xmap(epk::new, epk::b);
   public static final zn<ByteBuf, epk> b = zl.g.a(epk::new, epk::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
