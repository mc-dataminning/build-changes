import io.netty.buffer.ByteBuf;

public record dde(int b) {
   public static final zt<ByteBuf, dde> a = zt.a(zr.h, dde::a, dde::new);

   public int a() {
      return this.b;
   }
}
