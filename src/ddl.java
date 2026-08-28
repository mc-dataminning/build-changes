import io.netty.buffer.ByteBuf;

public record ddl(int b) {
   public static final zt<ByteBuf, ddl> a = zt.a(zr.h, ddl::a, ddl::new);

   public int a() {
      return this.b;
   }
}
