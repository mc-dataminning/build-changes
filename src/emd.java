import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record emd(int c) {
   public static final Codec<emd> a = Codec.INT.xmap(emd::new, emd::b);
   public static final ye<ByteBuf, emd> b = yc.f.a(emd::new, emd::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
