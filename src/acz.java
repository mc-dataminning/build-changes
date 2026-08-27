import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record acz(vs b, Optional<byte[]> c) implements xz<aai> {
   public static final xq<ByteBuf, acz> a = xq.a(vu.d, acz::b, xo.h.a(xo::a), acz::e, acz::new);

   @Override
   public yb<acz> a() {
      return aet.ap;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
