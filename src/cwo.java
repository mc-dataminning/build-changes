import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwo(int d) {
   public static final Codec<cwo> a = Codec.INT.xmap(cwo::new, cwo::a);
   public static final yv<ByteBuf, cwo> b = yt.e.a(cwo::new, cwo::a);
   public static final cwo c = new cwo(4603950);

   public int a() {
      return this.d;
   }
}
