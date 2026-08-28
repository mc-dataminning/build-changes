import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aet(xe b, Optional<byte[]> c) implements zl<aca> {
   public static final zc<ByteBuf, aet> a = zc.a(xg.f, aet::b, za.l.a(za::a), aet::e, aet::new);

   @Override
   public zn<aet> a() {
      return agp.aq;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
