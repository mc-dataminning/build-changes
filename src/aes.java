import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aes(xd b, Optional<byte[]> c) implements zk<abz> {
   public static final zb<ByteBuf, aes> a = zb.a(xf.f, aes::b, yz.k.a(yz::a), aes::e, aes::new);

   @Override
   public zm<aes> a() {
      return ago.aq;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
