import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record ael(wy b, Optional<byte[]> c) implements zf<abt> {
   public static final yw<ByteBuf, ael> a = yw.a(xa.f, ael::b, yu.k.a(yu::a), ael::e, ael::new);

   @Override
   public zh<ael> a() {
      return agf.ap;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
