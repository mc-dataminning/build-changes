import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epu(int c) {
   public static final Codec<epu> a = Codec.INT.xmap(epu::new, epu::b);
   public static final ys<ByteBuf, epu> b = yq.g.a(epu::new, epu::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
