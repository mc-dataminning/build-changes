import io.netty.buffer.ByteBuf;
import java.util.List;

public record aax(akg<? extends jj<?>> b, List<jn.a> c) implements zb<aav> {
   private static final ys<ByteBuf, akg<? extends jj<?>>> d = akh.b.a(akg::a, akg::a);
   public static final ys<vu, aax> a = ys.a(d, aax::b, jn.a.a.a(yq.a()), aax::e, aax::new);

   @Override
   public zd<aax> a() {
      return aba.b;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public List<jn.a> e() {
      return this.c;
   }
}
