import io.netty.buffer.ByteBuf;
import java.util.List;

public record abe(alf<? extends js<?>> b, List<jw.a> c) implements zf<abc> {
   private static final yw<ByteBuf, alf<? extends js<?>>> d = alg.b.a(alf::a, alf::a);
   public static final yw<vu, abe> a = yw.a(d, abe::b, jw.a.a.a(yu.a()), abe::e, abe::new);

   @Override
   public zh<abe> a() {
      return abi.b;
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public List<jw.a> e() {
      return this.c;
   }
}
