import io.netty.buffer.ByteBuf;

public record dcm(int b) {
   public static final yn<ByteBuf, dcm> a = yn.a(yl.h, dcm::a, dcm::new);

   public int a() {
      return this.b;
   }
}
