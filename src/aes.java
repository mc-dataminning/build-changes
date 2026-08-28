import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aes(xa b, Optional<byte[]> c) implements zh<abw> {
   public static final yy<ByteBuf, aes> a = yy.a(xc.f, aes::b, yw.n.a(yw::a), aes::e, aes::new);

   @Override
   public zj<aes> a() {
      return agp.at;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
