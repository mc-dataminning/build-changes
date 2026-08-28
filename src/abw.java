import io.netty.buffer.ByteBuf;
import java.util.List;

public record abw(List<ats> b) implements zs<abu> {
   public static final zj<ByteBuf, abw> a = zj.a(ats.a.a(zh.c(64)), abw::b, abw::new);

   @Override
   public zu<abw> a() {
      return abs.g;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }
}
