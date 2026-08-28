import io.netty.buffer.ByteBuf;

public record aho(jj b, boolean c) implements zc<agm> {
   public static final yt<ByteBuf, aho> a = yt.a(jj.b, aho::b, yr.b, aho::e, aho::new);

   @Override
   public ze<aho> a() {
      return agk.bO;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
