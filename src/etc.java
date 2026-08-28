import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record etc(int c) {
   public static final Codec<etc> a = Codec.INT.xmap(etc::new, etc::b);
   public static final zg<ByteBuf, etc> b = ze.h.a(etc::new, etc::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
