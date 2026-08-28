import io.netty.buffer.ByteBuf;
import java.util.List;

public record abq(List<aun> b) implements zj<abo> {
   public static final za<ByteBuf, abq> a = za.a(aun.a.a(yy.c(64)), abq::b, abq::new);

   @Override
   public zl<abq> a() {
      return abm.g;
   }

   public void a(abo $$0) {
      $$0.a(this);
   }
}
