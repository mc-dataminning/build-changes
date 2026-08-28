import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxh(int d) {
   public static final cxh a = new cxh(0);
   public static final Codec<cxh> b = Codec.INT.xmap(cxh::new, cxh::a);
   public static final zn<ByteBuf, cxh> c = zl.g.a(cxh::new, cxh::a);

   public int a() {
      return this.d;
   }
}
