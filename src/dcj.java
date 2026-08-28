import io.netty.buffer.ByteBuf;

public record dcj(int b) {
   public static final ym<ByteBuf, dcj> a = ym.a(yk.h, dcj::a, dcj::new);

   public int a() {
      return this.b;
   }
}
