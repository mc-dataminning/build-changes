import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record euq(int c) {
   public static final Codec<euq> a = Codec.INT.xmap(euq::new, euq::b);
   public static final yn<ByteBuf, euq> b = yl.h.a(euq::new, euq::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
