import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czj(int d) {
   public static final Codec<czj> a = Codec.INT.xmap(czj::new, czj::a);
   public static final ym<ByteBuf, czj> b = yk.g.a(czj::new, czj::a);
   public static final czj c = new czj(4603950);

   public int a() {
      return this.d;
   }
}
