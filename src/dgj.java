import io.netty.buffer.ByteBuf;

public record dgj(int b) {
   public static final ze<ByteBuf, dgj> a = ze.a(zc.h, dgj::a, dgj::new);

   public int a() {
      return this.b;
   }
}
