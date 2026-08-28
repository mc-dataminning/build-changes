import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxr(int d) {
   public static final Codec<cxr> a = Codec.INT.xmap(cxr::new, cxr::a);
   public static final zn<ByteBuf, cxr> b = zl.f.a(cxr::new, cxr::a);
   public static final cxr c = new cxr(4603950);

   public int a() {
      return this.d;
   }
}
