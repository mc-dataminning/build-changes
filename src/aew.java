import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aew(xh b, Optional<byte[]> c) implements zo<acd> {
   public static final zf<ByteBuf, aew> a = zf.a(xj.f, aew::b, zd.l.a(zd::a), aew::e, aew::new);

   @Override
   public zq<aew> a() {
      return ags.aq;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
