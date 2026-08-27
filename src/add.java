import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record add(vu b, Optional<byte[]> c) implements yb<aam> {
   public static final xs<ByteBuf, add> a = xs.a(vw.d, add::b, xq.h.a(xq::a), add::e, add::new);

   @Override
   public yd<add> a() {
      return aex.ap;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
