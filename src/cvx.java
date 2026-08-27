import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cvx(int d) {
   public static final Codec<cvx> a = Codec.INT.xmap(cvx::new, cvx::a);
   public static final ys<ByteBuf, cvx> b = yq.e.a(cvx::new, cvx::a);
   public static final cvx c = new cvx(4603950);

   public int a() {
      return this.d;
   }
}
