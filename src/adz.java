import io.netty.buffer.ByteBuf;
import java.util.List;

public record adz(List<dcm> b) implements yw<abl> {
   public static final yn<ByteBuf, adz> a = yn.a(dcm.a.a(yl.a()), adz::b, adz::new);

   @Override
   public yy<adz> a() {
      return age.al;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }
}
