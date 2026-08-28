import io.netty.buffer.ByteBuf;

public record der(int b) {
   public static final yu<ByteBuf, der> a = yu.a(ys.h, der::a, der::new);

   public int a() {
      return this.b;
   }
}
