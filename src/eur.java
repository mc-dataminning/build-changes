import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eur(int c) {
   public static final Codec<eur> a = Codec.INT.xmap(eur::new, eur::b);
   public static final yn<ByteBuf, eur> b = yl.h.a(eur::new, eur::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
