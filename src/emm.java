import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record emm(int c) {
   public static final Codec<emm> a = Codec.INT.xmap(emm::new, emm::b);
   public static final yg<ByteBuf, emm> b = ye.f.a(emm::new, emm::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
