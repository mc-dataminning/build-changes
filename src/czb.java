import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czb(int d) {
   public static final Codec<czb> a = Codec.INT.xmap(czb::new, czb::a);
   public static final zj<ByteBuf, czb> b = zh.g.a(czb::new, czb::a);
   public static final czb c = new czb(4603950);

   public int a() {
      return this.d;
   }
}
