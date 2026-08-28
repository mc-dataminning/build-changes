import io.netty.buffer.ByteBuf;

public record dfj(int b) {
   public static final yw<ByteBuf, dfj> a = yw.a(yu.h, dfj::a, dfj::new);

   public int a() {
      return this.b;
   }
}
