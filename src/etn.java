import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record etn(int c) {
   public static final Codec<etn> a = Codec.INT.xmap(etn::new, etn::b);
   public static final zh<ByteBuf, etn> b = zf.h.a(etn::new, etn::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
