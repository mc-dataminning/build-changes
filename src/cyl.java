import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyl(int d) {
   public static final Codec<cyl> a = Codec.INT.xmap(cyl::new, cyl::a);
   public static final zb<ByteBuf, cyl> b = yz.f.a(cyl::new, cyl::a);
   public static final cyl c = new cyl(4603950);

   public int a() {
      return this.d;
   }
}
