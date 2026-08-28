import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyb(int d) {
   public static final cyb a = new cyb(0);
   public static final Codec<cyb> b = Codec.INT.xmap(cyb::new, cyb::a);
   public static final zb<ByteBuf, cyb> c = yz.g.a(cyb::new, cyb::a);

   public int a() {
      return this.d;
   }
}
