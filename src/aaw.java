import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaw(List<atw> b) implements yv<aas> {
   public static final ym<ByteBuf, aaw> a = ym.a(atw.a.a(yk.a()), aaw::b, aaw::new);

   @Override
   public yx<aaw> a() {
      return aay.d;
   }

   public void a(aas $$0) {
      $$0.a(this);
   }
}
