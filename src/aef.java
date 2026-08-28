import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record aef(wu b, Optional<byte[]> c) implements zb<abn> {
   public static final ys<ByteBuf, aef> a = ys.a(ww.f, aef::b, yq.k.a(yq::a), aef::e, aef::new);

   @Override
   public zd<aef> a() {
      return afz.ap;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
