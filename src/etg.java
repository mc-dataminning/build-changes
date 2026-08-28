import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record etg(int c) {
   public static final Codec<etg> a = Codec.INT.xmap(etg::new, etg::b);
   public static final zj<ByteBuf, etg> b = zh.h.a(etg::new, etg::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
