import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record ctu(int d) {
   public static final ctu a = new ctu(0);
   public static final Codec<ctu> b = Codec.INT.xmap(ctu::new, ctu::a);
   public static final ye<ByteBuf, ctu> c = yc.f.a(ctu::new, ctu::a);

   public int a() {
      return this.d;
   }
}
