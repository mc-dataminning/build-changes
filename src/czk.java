import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czk(int d) {
   public static final Codec<czk> a = Codec.INT.xmap(czk::new, czk::a);
   public static final yn<ByteBuf, czk> b = yl.g.a(czk::new, czk::a);
   public static final czk c = new czk(4603950);

   public int a() {
      return this.d;
   }
}
