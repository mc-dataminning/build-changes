import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dak(int d) {
   public static final Codec<dak> a = Codec.INT.xmap(dak::new, dak::a);
   public static final zt<ByteBuf, dak> b = zr.g.a(dak::new, dak::a);
   public static final dak c = new dak(4603950);

   public int a() {
      return this.d;
   }
}
