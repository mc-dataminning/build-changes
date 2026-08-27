import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaw(List<asv> b) implements yz<aat> {
   public static final yq<ByteBuf, aaw> a = yq.a(asv.a.a(yo.a()), aaw::b, aaw::new);

   @Override
   public zb<aaw> a() {
      return aay.d;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }
}
