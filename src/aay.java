import io.netty.buffer.ByteBuf;
import java.util.List;

public record aay(List<asy> b) implements zb<aav> {
   public static final ys<ByteBuf, aay> a = ys.a(asy.a.a(yq.a()), aay::b, aay::new);

   @Override
   public zd<aay> a() {
      return aba.d;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }
}
