import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aem(wz b, Optional<byte[]> c) implements zg<abu> {
   public static final yx<ByteBuf, aem> a = yx.a(xb.f, aem::b, yv.k.a(yv::a), aem::e, aem::new);

   @Override
   public zi<aem> a() {
      return agg.ap;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
