import io.netty.buffer.ByteBuf;

public record aid(jh b, boolean c) implements zr<ahb> {
   public static final zi<ByteBuf, aid> a = zi.a(jh.b, aid::b, zg.b, aid::e, aid::new);

   @Override
   public zt<aid> a() {
      return agz.bO;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
