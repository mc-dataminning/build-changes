import io.netty.buffer.ByteBuf;
import java.util.List;

public record abi(alj<? extends jt<?>> b, List<jx.a> c) implements zj<abg> {
   private static final za<ByteBuf, alj<? extends jt<?>>> d = alk.b.a(alj::a, alj::a);
   public static final za<vy, abi> a = za.a(d, abi::b, jx.a.a.a(yy.a()), abi::e, abi::new);

   @Override
   public zl<abi> a() {
      return abm.b;
   }

   public void a(abg $$0) {
      $$0.a(this);
   }

   public List<jx.a> e() {
      return this.c;
   }
}
