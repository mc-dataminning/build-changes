import io.netty.buffer.ByteBuf;

public record dfx(int b) {
   public static final yy<ByteBuf, dfx> a = yy.a(yw.h, dfx::a, dfx::new);

   public int a() {
      return this.b;
   }
}
