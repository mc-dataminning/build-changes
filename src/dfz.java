import io.netty.buffer.ByteBuf;

public record dfz(int b) {
   public static final za<ByteBuf, dfz> a = za.a(yy.h, dfz::a, dfz::new);

   public int a() {
      return this.b;
   }
}
