import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record evo(int c) {
   public static final Codec<evo> a = Codec.INT.xmap(evo::new, evo::b);
   public static final yn<ByteBuf, evo> b = yl.h.a(evo::new, evo::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
