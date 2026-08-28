import io.netty.buffer.ByteBuf;
import java.util.List;

public record abx(List<auu> b) implements zo<abv> {
   public static final ze<ByteBuf, abx> a = ze.a(auu.a.a(zc.c(64)), abx::b, abx::new);

   @Override
   public zq<abx> a() {
      return abt.g;
   }

   public void a(abv $$0) {
      $$0.a(this);
   }
}
