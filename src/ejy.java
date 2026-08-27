import io.netty.buffer.ByteBuf;

public record ejy(int b) {
   public static final xs<ByteBuf, ejy> a = xq.d.a(ejy::new, ejy::b);

   public String a() {
      return "map_" + this.b;
   }
}
