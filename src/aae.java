import io.netty.buffer.ByteBuf;
import java.util.List;

public record aae(List<amj.c> b) implements zo<zw> {
   public static final ze<ByteBuf, aae> a = ze.a(amj.c, aae::b, aae::new);

   @Override
   public zq<aae> a() {
      return aai.h;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
