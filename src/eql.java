import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record eql(int c) {
   public static final Codec<eql> a = Codec.INT.xmap(eql::new, eql::b);
   public static final yw<ByteBuf, eql> b = yu.g.a(eql::new, eql::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
