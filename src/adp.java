import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record adp(wg b, Optional<byte[]> c) implements yn<aay> {
   public static final ye<ByteBuf, adp> a = ye.a(wi.f, adp::b, yc.j.a(yc::a), adp::e, adp::new);

   @Override
   public yp<adp> a() {
      return afj.ap;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
