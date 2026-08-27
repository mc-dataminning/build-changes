import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeo(xe b, Optional<byte[]> c) implements zl<abw> {
   public static final zc<ByteBuf, aeo> a = zc.a(xg.f, aeo::b, za.k.a(za::a), aeo::e, aeo::new);

   @Override
   public zn<aeo> a() {
      return agj.aq;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
