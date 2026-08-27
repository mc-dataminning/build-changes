import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eoh(int c) {
   public static final Codec<eoh> a = Codec.INT.xmap(eoh::new, eoh::b);
   public static final yv<ByteBuf, eoh> b = yt.f.a(eoh::new, eoh::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
