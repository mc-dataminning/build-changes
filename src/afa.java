import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afa(xl b, Optional<byte[]> c) implements zs<ach> {
   public static final zj<ByteBuf, afa> a = zj.a(xn.f, afa::b, zh.l.a(zh::a), afa::e, afa::new);

   @Override
   public zu<afa> a() {
      return agw.aq;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
