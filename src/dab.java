import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dab(int d) {
   public static final Codec<dab> a = Codec.INT.xmap(dab::new, dab::a);
   public static final yn<ByteBuf, dab> b = yl.g.a(dab::new, dab::a);
   public static final dab c = new dab(4603950);

   public int a() {
      return this.d;
   }
}
