import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeh(wx b, Optional<byte[]> c) implements ze<abq> {
   public static final yv<ByteBuf, aeh> a = yv.a(wz.f, aeh::b, yt.j.a(yt::a), aeh::e, aeh::new);

   @Override
   public zg<aeh> a() {
      return agb.ap;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
