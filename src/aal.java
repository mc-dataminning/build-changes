import io.netty.buffer.ByteBuf;
import java.util.List;

public record aal(aju<? extends ja<?>> b, List<je.a> c) implements yp<aaj> {
   private static final yg<ByteBuf, aju<? extends ja<?>>> d = ajv.b.a(aju::a, aju::a);
   public static final yg<vi, aal> a = yg.a(d, aal::b, je.a.a.a(ye.a()), aal::e, aal::new);

   @Override
   public yr<aal> a() {
      return aao.b;
   }

   public void a(aaj $$0) {
      $$0.a(this);
   }

   public List<je.a> e() {
      return this.c;
   }
}
