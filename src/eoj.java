import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eoj(int c) {
   public static final Codec<eoj> a = Codec.INT.xmap(eoj::new, eoj::b);
   public static final yv<ByteBuf, eoj> b = yt.f.a(eoj::new, eoj::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
