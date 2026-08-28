import io.netty.buffer.ByteBuf;

public record dck(int b) {
   public static final yn<ByteBuf, dck> a = yn.a(yl.h, dck::a, dck::new);

   public int a() {
      return this.b;
   }
}
