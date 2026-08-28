import io.netty.buffer.ByteBuf;

public record ahp(int b, boolean c) implements zc<agm> {
   public static final yt<ByteBuf, ahp> a = yt.a(yr.h, ahp::b, yr.b, ahp::e, ahp::new);

   @Override
   public ze<ahp> a() {
      return agk.bP;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
