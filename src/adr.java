import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record adr(wi b, Optional<byte[]> c) implements yp<aba> {
   public static final yg<ByteBuf, adr> a = yg.a(wk.f, adr::b, ye.j.a(ye::a), adr::e, adr::new);

   @Override
   public yr<adr> a() {
      return afl.ap;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
