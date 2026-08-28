import io.netty.buffer.ByteBuf;
import java.util.List;

public record abn(alg<? extends kc<?>> b, List<kg.a> c) implements zo<abl> {
   private static final zf<ByteBuf, alg<? extends kc<?>>> d = alh.b.a(alg::a, alg::a);
   public static final zf<we, abn> a = zf.a(d, abn::b, kg.a.a.a(zd.a()), abn::e, abn::new);

   @Override
   public zq<abn> a() {
      return abr.b;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public List<kg.a> e() {
      return this.c;
   }
}
