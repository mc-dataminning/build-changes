import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record evi(int c) {
   public static final Codec<evi> a = Codec.INT.xmap(evi::new, evi::b);
   public static final zi<ByteBuf, evi> b = zg.h.a(evi::new, evi::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
