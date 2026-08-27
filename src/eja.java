import io.netty.buffer.ByteBuf;

public record eja(int b) {
   public static final xq<ByteBuf, eja> a = xo.d.a(eja::new, eja::b);

   public String a() {
      return "map_" + this.b;
   }
}
