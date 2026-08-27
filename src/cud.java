import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cud(int d) {
   public static final cud a = new cud(0);
   public static final Codec<cud> b = Codec.INT.xmap(cud::new, cud::a);
   public static final yg<ByteBuf, cud> c = ye.f.a(cud::new, cud::a);

   public int a() {
      return this.d;
   }
}
