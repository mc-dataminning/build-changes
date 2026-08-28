import io.netty.buffer.ByteBuf;
import java.util.List;

public record abq(alo<? extends kd<?>> b, List<kh.a> c) implements zr<abo> {
   private static final zi<ByteBuf, alo<? extends kd<?>>> d = alp.b.a(alo::a, alo::a);
   public static final zi<wh, abq> a = zi.a(d, abq::b, kh.a.a.a(zg.a()), abq::e, abq::new);

   @Override
   public zt<abq> a() {
      return abu.b;
   }

   public void a(abo $$0) {
      $$0.a(this);
   }

   public List<kh.a> e() {
      return this.c;
   }
}
