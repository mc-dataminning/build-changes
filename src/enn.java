import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record enn(int c) {
   public static final Codec<enn> a = Codec.INT.xmap(enn::new, enn::b);
   public static final ys<ByteBuf, enn> b = yq.f.a(enn::new, enn::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
