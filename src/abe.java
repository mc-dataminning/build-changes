import io.netty.buffer.ByteBuf;
import java.util.List;

public record abe(alf<? extends jr<?>> b, List<jv.a> c) implements zf<abc> {
   private static final yw<ByteBuf, alf<? extends jr<?>>> d = alg.b.a(alf::a, alf::a);
   public static final yw<vu, abe> a = yw.a(d, abe::b, jv.a.a.a(yu.a()), abe::e, abe::new);

   @Override
   public zh<abe> a() {
      return abi.b;
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public List<jv.a> e() {
      return this.c;
   }
}
