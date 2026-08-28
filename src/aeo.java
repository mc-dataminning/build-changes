import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeo(ww b, Optional<byte[]> c) implements zd<abs> {
   public static final yu<ByteBuf, aeo> a = yu.a(wy.f, aeo::b, ys.n.a(ys::a), aeo::e, aeo::new);

   @Override
   public zf<aeo> a() {
      return agl.at;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
