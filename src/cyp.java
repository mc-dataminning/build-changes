import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyp(int d) {
   public static final cyp a = new cyp(0);
   public static final Codec<cyp> b = Codec.INT.xmap(cyp::new, cyp::a);
   public static final zj<ByteBuf, cyp> c = zh.h.a(cyp::new, cyp::a);

   public int a() {
      return this.d;
   }
}
