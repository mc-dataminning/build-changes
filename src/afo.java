import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afo(xv b, Optional<byte[]> c) implements aac<acr> {
   public static final zt<ByteBuf, afo> a = zt.a(xx.f, afo::b, zr.n.a(zr::a), afo::e, afo::new);

   @Override
   public aae<afo> a() {
      return ahk.at;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
