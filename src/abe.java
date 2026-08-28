import io.netty.buffer.ByteBuf;
import java.util.List;

public record abe(akq<? extends jz<?>> b, List<kd.a> c) implements zg<abc> {
   private static final yx<ByteBuf, akq<? extends jz<?>>> d = akr.b.a(akq::a, akq::a);
   public static final yx<vw, abe> a = yx.a(d, abe::b, kd.a.a.a(yv.a()), abe::e, abe::new);

   @Override
   public zi<abe> a() {
      return abi.b;
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public List<kd.a> e() {
      return this.c;
   }
}
