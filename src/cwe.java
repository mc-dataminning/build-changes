import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cwe(int d) {
   public static final cwe a = new cwe(0);
   public static final Codec<cwe> b = Codec.INT.xmap(cwe::new, cwe::a);
   public static final yv<ByteBuf, cwe> c = yt.f.a(cwe::new, cwe::a);

   public int a() {
      return this.d;
   }
}
