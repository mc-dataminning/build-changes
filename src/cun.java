import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cun(int d) {
   public static final Codec<cun> a = Codec.INT.xmap(cun::new, cun::a);
   public static final yg<ByteBuf, cun> b = ye.e.a(cun::new, cun::a);
   public static final cun c = new cun(4603950);

   public int a() {
      return this.d;
   }
}
