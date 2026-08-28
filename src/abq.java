import io.netty.buffer.ByteBuf;
import java.util.List;

public record abq(List<ats> b) implements zs<abm> {
   public static final zj<ByteBuf, abq> a = zj.a(ats.a.a(zh.a()), abq::b, abq::new);

   @Override
   public zu<abq> a() {
      return abs.d;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }
}
