import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dac(int d) {
   public static final Codec<dac> a = Codec.INT.xmap(dac::new, dac::a);
   public static final zi<ByteBuf, dac> b = zg.g.a(dac::new, dac::a);
   public static final dac c = new dac(4603950);

   public int a() {
      return this.d;
   }
}
