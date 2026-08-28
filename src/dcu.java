import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dcu(int d) {
   public static final Codec<dcu> a = Codec.INT.xmap(dcu::new, dcu::a);
   public static final yy<ByteBuf, dcu> b = yw.g.a(dcu::new, dcu::a);
   public static final dcu c = new dcu(4603950);

   public int a() {
      return this.d;
   }
}
