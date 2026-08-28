import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dbu(int d) {
   public static final Codec<dbu> a = Codec.INT.xmap(dbu::new, dbu::a);
   public static final yw<ByteBuf, dbu> b = yu.g.a(dbu::new, dbu::a);
   public static final dbu c = new dbu(4603950);

   public int a() {
      return this.d;
   }
}
