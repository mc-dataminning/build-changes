import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cyx(int d) {
   public static final Codec<cyx> a = Codec.INT.xmap(cyx::new, cyx::a);
   public static final zg<ByteBuf, cyx> b = ze.g.a(cyx::new, cyx::a);
   public static final cyx c = new cyx(4603950);

   public int a() {
      return this.d;
   }
}
