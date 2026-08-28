import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eqr(int c) {
   public static final Codec<eqr> a = Codec.INT.xmap(eqr::new, eqr::b);
   public static final yx<ByteBuf, eqr> b = yv.g.a(eqr::new, eqr::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
