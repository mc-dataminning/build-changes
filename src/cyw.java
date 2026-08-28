import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyw(int d) {
   public static final cyw a = new cyw(0);
   public static final Codec<cyw> b = Codec.INT.xmap(cyw::new, cyw::a);
   public static final zh<ByteBuf, cyw> c = zf.h.a(cyw::new, cyw::a);

   public int a() {
      return this.d;
   }
}
