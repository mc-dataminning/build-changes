import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxn(int d) {
   public static final Codec<cxn> a = Codec.INT.xmap(cxn::new, cxn::a);
   public static final zm<ByteBuf, cxn> b = zk.f.a(cxn::new, cxn::a);
   public static final cxn c = new cxn(4603950);

   public int a() {
      return this.d;
   }
}
