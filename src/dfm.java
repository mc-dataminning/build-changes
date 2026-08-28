import io.netty.buffer.ByteBuf;

public record dfm(int b) {
   public static final yw<ByteBuf, dfm> a = yw.a(yu.h, dfm::a, dfm::new);

   public int a() {
      return this.b;
   }
}
