import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyr(int d) {
   public static final Codec<cyr> a = Codec.INT.xmap(cyr::new, cyr::a);
   public static final zf<ByteBuf, cyr> b = zd.g.a(cyr::new, cyr::a);
   public static final cyr c = new cyr(4603950);

   public int a() {
      return this.d;
   }
}
