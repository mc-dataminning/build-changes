import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyl(int d) {
   public static final cyl a = new cyl(0);
   public static final Codec<cyl> b = Codec.INT.xmap(cyl::new, cyl::a);
   public static final zg<ByteBuf, cyl> c = ze.h.a(cyl::new, cyl::a);

   public int a() {
      return this.d;
   }
}
