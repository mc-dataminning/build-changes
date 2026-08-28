import io.netty.buffer.ByteBuf;

public record dfc(int b) {
   public static final yw<ByteBuf, dfc> a = yw.a(yu.h, dfc::a, dfc::new);

   public int a() {
      return this.b;
   }
}
