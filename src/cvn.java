import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cvn(int d) {
   public static final cvn a = new cvn(0);
   public static final Codec<cvn> b = Codec.INT.xmap(cvn::new, cvn::a);
   public static final ys<ByteBuf, cvn> c = yq.f.a(cvn::new, cvn::a);

   public int a() {
      return this.d;
   }
}
