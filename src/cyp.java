import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyp(int d) {
   public static final Codec<cyp> a = Codec.INT.xmap(cyp::new, cyp::a);
   public static final zb<ByteBuf, cyp> b = yz.f.a(cyp::new, cyp::a);
   public static final cyp c = new cyp(4603950);

   public int a() {
      return this.d;
   }
}
