import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epi(int c) {
   public static final Codec<epi> a = Codec.INT.xmap(epi::new, epi::b);
   public static final zn<ByteBuf, epi> b = zl.g.a(epi::new, epi::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
