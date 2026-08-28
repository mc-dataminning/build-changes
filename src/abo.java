import io.netty.buffer.ByteBuf;
import java.util.List;

public record abo(ala<? extends jv<?>> b, List<jz.a> c) implements zs<abm> {
   private static final zj<ByteBuf, ala<? extends jv<?>>> d = alb.b.a(ala::a, ala::a);
   public static final zj<wl, abo> a = zj.a(d, abo::b, jz.a.a.a(zh.a()), abo::e, abo::new);

   @Override
   public zu<abo> a() {
      return abs.b;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public List<jz.a> e() {
      return this.c;
   }
}
