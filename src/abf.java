import io.netty.buffer.ByteBuf;
import java.util.List;

public record abf(List<atd> b) implements zb<abd> {
   public static final ys<ByteBuf, abf> a = ys.a(atd.a.a(yq.c(64)), abf::b, abf::new);

   @Override
   public zd<abf> a() {
      return abb.g;
   }

   public void a(abd $$0) {
      $$0.a(this);
   }
}
