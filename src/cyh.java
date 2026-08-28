import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyh(int d) {
   public static final cyh a = new cyh(0);
   public static final Codec<cyh> b = Codec.INT.xmap(cyh::new, cyh::a);
   public static final zf<ByteBuf, cyh> c = zd.h.a(cyh::new, cyh::a);

   public int a() {
      return this.d;
   }
}
