import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeh(wo b, Optional<byte[]> c) implements yv<abk> {
   public static final ym<ByteBuf, aeh> a = ym.a(wq.f, aeh::b, yk.n.a(yk::a), aeh::e, aeh::new);

   @Override
   public yx<aeh> a() {
      return agd.at;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
