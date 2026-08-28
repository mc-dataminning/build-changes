import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eus(int c) {
   public static final Codec<eus> a = Codec.INT.xmap(eus::new, eus::b);
   public static final yn<ByteBuf, eus> b = yl.h.a(eus::new, eus::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
