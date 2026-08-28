import io.netty.buffer.ByteBuf;
import java.util.List;

public record abv(List<aug> b) implements zo<abt> {
   public static final zf<ByteBuf, abv> a = zf.a(aug.a.a(zd.c(64)), abv::b, abv::new);

   @Override
   public zq<abv> a() {
      return abr.g;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }
}
