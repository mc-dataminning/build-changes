import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aei(wx b, Optional<byte[]> c) implements ze<abq> {
   public static final yv<ByteBuf, aei> a = yv.a(wz.f, aei::b, yt.j.a(yt::a), aei::e, aei::new);

   @Override
   public zg<aei> a() {
      return agc.ap;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
