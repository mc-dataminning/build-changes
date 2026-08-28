import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cws(int d) {
   public static final cws a = new cws(0);
   public static final Codec<cws> b = Codec.INT.xmap(cws::new, cws::a);
   public static final ys<ByteBuf, cws> c = yq.g.a(cws::new, cws::a);

   public int a() {
      return this.d;
   }
}
