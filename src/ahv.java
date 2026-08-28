import io.netty.buffer.ByteBuf;

public record ahv(iw b, boolean c) implements zj<agt> {
   public static final za<ByteBuf, ahv> a = za.a(iw.b, ahv::b, yy.b, ahv::e, ahv::new);

   @Override
   public zl<ahv> a() {
      return agr.bO;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
