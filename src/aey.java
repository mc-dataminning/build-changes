import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aey(xj b, Optional<byte[]> c) implements zq<acf> {
   public static final zh<ByteBuf, aey> a = zh.a(xl.f, aey::b, zf.m.a(zf::a), aey::e, aey::new);

   @Override
   public zs<aey> a() {
      return agu.aq;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
