import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyi(int d) {
   public static final cyi a = new cyi(0);
   public static final Codec<cyi> b = Codec.INT.xmap(cyi::new, cyi::a);
   public static final zc<ByteBuf, cyi> c = za.h.a(cyi::new, cyi::a);

   public int a() {
      return this.d;
   }
}
