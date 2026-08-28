import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cys(int d) {
   public static final Codec<cys> a = Codec.INT.xmap(cys::new, cys::a);
   public static final zc<ByteBuf, cys> b = za.g.a(cys::new, cys::a);
   public static final cys c = new cys(4603950);

   public int a() {
      return this.d;
   }
}
