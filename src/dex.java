import io.netty.buffer.ByteBuf;

public record dex(int b) {
   public static final yw<ByteBuf, dex> a = yw.a(yu.h, dex::a, dex::new);

   public int a() {
      return this.b;
   }
}
