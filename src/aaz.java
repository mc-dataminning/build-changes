import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaz(List<atb> b) implements zb<aav> {
   public static final ys<ByteBuf, aaz> a = ys.a(atb.a.a(yq.a()), aaz::b, aaz::new);

   @Override
   public zd<aaz> a() {
      return abb.d;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }
}
