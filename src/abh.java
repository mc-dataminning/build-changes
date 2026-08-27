import io.netty.buffer.ByteBuf;
import java.util.List;

public record abh(aks<? extends jn<?>> b, List<jr.a> c) implements zl<abf> {
   private static final zc<ByteBuf, aks<? extends jn<?>>> d = akt.b.a(aks::a, aks::a);
   public static final zc<we, abh> a = zc.a(d, abh::b, jr.a.a.a(za.a()), abh::e, abh::new);

   @Override
   public zn<abh> a() {
      return abk.b;
   }

   public void a(abf $$0) {
      $$0.a(this);
   }

   public List<jr.a> e() {
      return this.c;
   }
}
