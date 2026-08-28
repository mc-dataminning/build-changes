import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dag(int d) {
   public static final Codec<dag> a = Codec.INT.xmap(dag::new, dag::a);
   public static final zt<ByteBuf, dag> b = zr.g.a(dag::new, dag::a);
   public static final dag c = new dag(4603950);

   public int a() {
      return this.d;
   }
}
