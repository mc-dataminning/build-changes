import io.netty.buffer.ByteBuf;
import java.util.List;

public record acb(aly<? extends kd<?>> b, List<kh.a> c) implements aac<abz> {
   private static final zt<ByteBuf, aly<? extends kd<?>>> d = alz.b.a(aly::a, aly::a);
   public static final zt<ws, acb> a = zt.a(d, acb::b, kh.a.a.a(zr.a()), acb::e, acb::new);

   @Override
   public aae<acb> a() {
      return acf.b;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public List<kh.a> e() {
      return this.c;
   }
}
