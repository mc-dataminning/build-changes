import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dcj(int d) {
   public static final Codec<dcj> a = Codec.INT.xmap(dcj::new, dcj::a);
   public static final yw<ByteBuf, dcj> b = yu.g.a(dcj::new, dcj::a);
   public static final dcj c = new dcj(4603950);

   public int a() {
      return this.d;
   }
}
