import io.netty.buffer.ByteBuf;
import java.util.List;

public record aax(akj<? extends jw<?>> b, List<ka.a> c) implements zb<aav> {
   private static final ys<ByteBuf, akj<? extends jw<?>>> d = akk.b.a(akj::a, akj::a);
   public static final ys<vr, aax> a = ys.a(d, aax::b, ka.a.a.a(yq.a()), aax::e, aax::new);

   @Override
   public zd<aax> a() {
      return abb.b;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public List<ka.a> e() {
      return this.c;
   }
}
