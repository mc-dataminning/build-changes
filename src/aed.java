import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aed(wu b, Optional<byte[]> c) implements zb<abm> {
   public static final ys<ByteBuf, aed> a = ys.a(ww.f, aed::b, yq.j.a(yq::a), aed::e, aed::new);

   @Override
   public zd<aed> a() {
      return afx.ap;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
