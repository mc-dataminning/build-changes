import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaw(List<atv> b) implements yv<aas> {
   public static final ym<ByteBuf, aaw> a = ym.a(atv.a.a(yk.a()), aaw::b, aaw::new);

   @Override
   public yx<aaw> a() {
      return aay.d;
   }

   public void a(aas $$0) {
      $$0.a(this);
   }
}
