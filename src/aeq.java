import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeq(wy b, Optional<byte[]> c) implements zf<abu> {
   public static final yw<ByteBuf, aeq> a = yw.a(xa.f, aeq::b, yu.n.a(yu::a), aeq::e, aeq::new);

   @Override
   public zh<aeq> a() {
      return agn.at;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
