import io.netty.buffer.ByteBuf;
import java.util.List;

public record aas(List<asl> b) implements yp<aaq> {
   public static final yg<ByteBuf, aas> a = yg.a(asl.a.a(ye.c(64)), aas::b, aas::new);

   @Override
   public yr<aas> a() {
      return aao.f;
   }

   public void a(aaq $$0) {
      $$0.a(this);
   }
}
