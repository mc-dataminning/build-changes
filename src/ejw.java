import io.netty.buffer.ByteBuf;

public record ejw(int b) {
   public static final xs<ByteBuf, ejw> a = xq.d.a(ejw::new, ejw::b);

   public String a() {
      return "map_" + this.b;
   }
}
