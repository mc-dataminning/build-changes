import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxf(int d) {
   public static final cxf a = new cxf(0);
   public static final Codec<cxf> b = Codec.INT.xmap(cxf::new, cxf::a);
   public static final zn<ByteBuf, cxf> c = zl.g.a(cxf::new, cxf::a);

   public int a() {
      return this.d;
   }
}
