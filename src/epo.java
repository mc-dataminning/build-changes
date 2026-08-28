import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epo(int c) {
   public static final Codec<epo> a = Codec.INT.xmap(epo::new, epo::b);
   public static final ys<ByteBuf, epo> b = yq.g.a(epo::new, epo::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
