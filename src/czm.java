import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czm(int d) {
   public static final Codec<czm> a = Codec.INT.xmap(czm::new, czm::a);
   public static final yn<ByteBuf, czm> b = yl.g.a(czm::new, czm::a);
   public static final czm c = new czm(4603950);

   public int a() {
      return this.d;
   }
}
