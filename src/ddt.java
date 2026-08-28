import io.netty.buffer.ByteBuf;

public record ddt(int b) {
   public static final yt<ByteBuf, ddt> a = yt.a(yr.h, ddt::a, ddt::new);

   public int a() {
      return this.b;
   }
}
