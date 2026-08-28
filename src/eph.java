import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eph(int c) {
   public static final Codec<eph> a = Codec.INT.xmap(eph::new, eph::b);
   public static final zm<ByteBuf, eph> b = zk.g.a(eph::new, eph::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
