import io.netty.buffer.ByteBuf;
import java.util.List;

public record abd(akp<? extends jz<?>> b, List<kd.a> c) implements zf<abb> {
   private static final yw<ByteBuf, akp<? extends jz<?>>> d = akq.b.a(akp::a, akp::a);
   public static final yw<vv, abd> a = yw.a(d, abd::b, kd.a.a.a(yu.a()), abd::e, abd::new);

   @Override
   public zh<abd> a() {
      return abh.b;
   }

   public void a(abb $$0) {
      $$0.a(this);
   }

   public List<kd.a> e() {
      return this.c;
   }
}
