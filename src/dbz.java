import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dbz(int d) {
   public static final Codec<dbz> a = Codec.INT.xmap(dbz::new, dbz::a);
   public static final yw<ByteBuf, dbz> b = yu.g.a(dbz::new, dbz::a);
   public static final dbz c = new dbz(4603950);

   public int a() {
      return this.d;
   }
}
