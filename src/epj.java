import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epj(int c) {
   public static final Codec<epj> a = Codec.INT.xmap(epj::new, epj::b);
   public static final zn<ByteBuf, epj> b = zl.g.a(epj::new, epj::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
