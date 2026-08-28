import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eqp(int c) {
   public static final Codec<eqp> a = Codec.INT.xmap(eqp::new, eqp::b);
   public static final yx<ByteBuf, eqp> b = yv.g.a(eqp::new, eqp::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
