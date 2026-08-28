import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dbo(int d) {
   public static final Codec<dbo> a = Codec.INT.xmap(dbo::new, dbo::a);
   public static final yu<ByteBuf, dbo> b = ys.g.a(dbo::new, dbo::a);
   public static final dbo c = new dbo(4603950);

   public int a() {
      return this.d;
   }
}
