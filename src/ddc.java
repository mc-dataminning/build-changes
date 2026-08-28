import io.netty.buffer.ByteBuf;

public record ddc(int b) {
   public static final zi<ByteBuf, ddc> a = zi.a(zg.h, ddc::a, ddc::new);

   public int a() {
      return this.b;
   }
}
