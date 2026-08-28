import io.netty.buffer.ByteBuf;

public record dcl(int b) {
   public static final ym<ByteBuf, dcl> a = ym.a(yk.h, dcl::a, dcl::new);

   public int a() {
      return this.b;
   }
}
