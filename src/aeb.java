import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeb(ws b, Optional<byte[]> c) implements yz<abk> {
   public static final yq<ByteBuf, aeb> a = yq.a(wu.f, aeb::b, yo.j.a(yo::a), aeb::e, aeb::new);

   @Override
   public zb<aeb> a() {
      return afv.ap;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
