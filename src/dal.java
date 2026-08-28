import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dal(int d) {
   public static final Codec<dal> a = Codec.INT.xmap(dal::new, dal::a);
   public static final zt<ByteBuf, dal> b = zr.g.a(dal::new, dal::a);
   public static final dal c = new dal(4603950);

   public int a() {
      return this.d;
   }
}
