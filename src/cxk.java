import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxk(int d) {
   public static final Codec<cxk> a = Codec.INT.xmap(cxk::new, cxk::a);
   public static final zj<ByteBuf, cxk> b = zh.f.a(cxk::new, cxk::a);
   public static final cxk c = new cxk(4603950);

   public int a() {
      return this.d;
   }
}
