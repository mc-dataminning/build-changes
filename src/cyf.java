import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyf(int d) {
   public static final cyf a = new cyf(0);
   public static final Codec<cyf> b = Codec.INT.xmap(cyf::new, cyf::a);
   public static final zb<ByteBuf, cyf> c = yz.g.a(cyf::new, cyf::a);

   public int a() {
      return this.d;
   }
}
