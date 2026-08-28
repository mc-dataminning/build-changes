import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aez(xo b, Optional<byte[]> c) implements zv<ach> {
   public static final zm<ByteBuf, aez> a = zm.a(xq.f, aez::b, zk.k.a(zk::a), aez::e, aez::new);

   @Override
   public zx<aez> a() {
      return agt.ap;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
