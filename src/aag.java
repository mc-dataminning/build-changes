import io.netty.buffer.ByteBuf;
import java.util.List;

public record aag(List<amd.c> b) implements zs<zy> {
   public static final zj<ByteBuf, aag> a = zj.a(amd.c, aag::b, aag::new);

   @Override
   public zu<aag> a() {
      return aak.h;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }
}
