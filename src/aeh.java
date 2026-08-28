import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeh(wp b, Optional<byte[]> c) implements yw<abl> {
   public static final yn<ByteBuf, aeh> a = yn.a(wr.f, aeh::b, yl.n.a(yl::a), aeh::e, aeh::new);

   @Override
   public yy<aeh> a() {
      return agd.as;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
