import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record ewl(int c) {
   public static final Codec<ewl> a = Codec.INT.xmap(ewl::new, ewl::b);
   public static final yt<ByteBuf, ewl> b = yr.h.a(ewl::new, ewl::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
