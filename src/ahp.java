import io.netty.buffer.ByteBuf;

public record ahp(iu b, boolean c) implements zd<agn> {
   public static final yu<ByteBuf, ahp> a = yu.a(iu.b, ahp::b, ys.b, ahp::e, ahp::new);

   @Override
   public zf<ahp> a() {
      return agl.bO;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
