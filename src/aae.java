import io.netty.buffer.ByteBuf;
import java.util.List;

public record aae(List<amb.c> b) implements zq<zw> {
   public static final zh<ByteBuf, aae> a = zh.a(amb.c, aae::b, aae::new);

   @Override
   public zs<aae> a() {
      return aai.h;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
