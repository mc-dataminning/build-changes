import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aen(wv b, Optional<byte[]> c) implements zc<abr> {
   public static final yt<ByteBuf, aen> a = yt.a(wx.f, aen::b, yr.n.a(yr::a), aen::e, aen::new);

   @Override
   public ze<aen> a() {
      return agk.at;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
