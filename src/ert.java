import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record ert(int c) {
   public static final Codec<ert> a = Codec.INT.xmap(ert::new, ert::b);
   public static final zb<ByteBuf, ert> b = yz.g.a(ert::new, ert::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
