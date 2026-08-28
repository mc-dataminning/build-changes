import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afd(xk b, Optional<byte[]> c) implements zr<acg> {
   public static final zi<ByteBuf, afd> a = zi.a(xm.f, afd::b, zg.n.a(zg::a), afd::e, afd::new);

   @Override
   public zt<afd> a() {
      return agz.at;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
