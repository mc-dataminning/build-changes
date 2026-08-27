import io.netty.buffer.ByteBuf;
import java.util.List;

public record aam(List<asl> b) implements yp<aaj> {
   public static final yg<ByteBuf, aam> a = yg.a(asl.a.a(ye.a()), aam::b, aam::new);

   @Override
   public yr<aam> a() {
      return aao.d;
   }

   public void a(aaj $$0) {
      $$0.a(this);
   }
}
