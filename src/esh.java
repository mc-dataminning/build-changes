import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record esh(int c) {
   public static final Codec<esh> a = Codec.INT.xmap(esh::new, esh::b);
   public static final zb<ByteBuf, esh> b = yz.g.a(esh::new, esh::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
