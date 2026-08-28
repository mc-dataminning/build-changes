import io.netty.buffer.ByteBuf;
import java.util.List;

public record abp(List<aug> b) implements zo<abl> {
   public static final zf<ByteBuf, abp> a = zf.a(aug.a.a(zd.a()), abp::b, abp::new);

   @Override
   public zq<abp> a() {
      return abr.d;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }
}
