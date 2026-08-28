import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aeu(xc b, Optional<byte[]> c) implements zj<aby> {
   public static final za<ByteBuf, aeu> a = za.a(xe.f, aeu::b, yy.n.a(yy::a), aeu::e, aeu::new);

   @Override
   public zl<aeu> a() {
      return agr.at;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
