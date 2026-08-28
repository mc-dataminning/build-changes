import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czq(int d) {
   public static final czq a = new czq(0);
   public static final Codec<czq> b = Codec.INT.xmap(czq::new, czq::a);
   public static final zi<ByteBuf, czq> c = zg.h.a(czq::new, czq::a);

   public int a() {
      return this.d;
   }
}
