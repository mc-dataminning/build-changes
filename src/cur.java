import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cur(int d) {
   public static final cur a = new cur(0);
   public static final Codec<cur> b = Codec.INT.xmap(cur::new, cur::a);
   public static final yq<ByteBuf, cur> c = yo.f.a(cur::new, cur::a);

   public int a() {
      return this.d;
   }
}
