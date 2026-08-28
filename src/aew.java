import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aew(xl b, Optional<byte[]> c) implements zs<ace> {
   public static final zj<ByteBuf, aew> a = zj.a(xn.f, aew::b, zh.k.a(zh::a), aew::e, aew::new);

   @Override
   public zu<aew> a() {
      return agq.ap;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
