import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record epg(int c) {
   public static final Codec<epg> a = Codec.INT.xmap(epg::new, epg::b);
   public static final zm<ByteBuf, epg> b = zk.g.a(epg::new, epg::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
