import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aex(xi b, Optional<byte[]> c) implements zp<ace> {
   public static final zg<ByteBuf, aex> a = zg.a(xk.f, aex::b, ze.l.a(ze::a), aex::e, aex::new);

   @Override
   public zr<aex> a() {
      return agt.aq;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
