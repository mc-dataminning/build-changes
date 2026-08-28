import io.netty.buffer.ByteBuf;

public record ddk(int b) {
   public static final zt<ByteBuf, ddk> a = zt.a(zr.h, ddk::a, ddk::new);

   public int a() {
      return this.b;
   }
}
