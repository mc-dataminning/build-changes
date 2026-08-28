import io.netty.buffer.ByteBuf;
import java.util.List;

public record aau(akt<? extends ke<?>> b, List<ki.a> c) implements yv<aas> {
   private static final ym<ByteBuf, akt<? extends ke<?>>> d = aku.b.a(akt::a, akt::a);
   public static final ym<vl, aau> a = ym.a(d, aau::b, ki.a.a.a(yk.a()), aau::e, aau::new);

   @Override
   public yx<aau> a() {
      return aay.b;
   }

   public void a(aas $$0) {
      $$0.a(this);
   }

   public List<ki.a> e() {
      return this.c;
   }
}
