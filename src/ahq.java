import io.netty.buffer.ByteBuf;

public record ahq(int b, boolean c) implements zd<agn> {
   public static final yu<ByteBuf, ahq> a = yu.a(ys.h, ahq::b, ys.b, ahq::e, ahq::new);

   @Override
   public zf<ahq> a() {
      return agl.bP;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
