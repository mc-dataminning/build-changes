import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record enc(int c) {
   public static final Codec<enc> a = Codec.INT.xmap(enc::new, enc::b);
   public static final yq<ByteBuf, enc> b = yo.f.a(enc::new, enc::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
