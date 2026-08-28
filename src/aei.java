import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aei(wp b, Optional<byte[]> c) implements yw<abl> {
   public static final yn<ByteBuf, aei> a = yn.a(wr.f, aei::b, yl.n.a(yl::a), aei::e, aei::new);

   @Override
   public yy<aei> a() {
      return age.at;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
