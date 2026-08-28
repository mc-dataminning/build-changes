import io.netty.buffer.ByteBuf;
import java.util.List;

public record abo(alh<? extends kd<?>> b, List<kh.a> c) implements zp<abm> {
   private static final zg<ByteBuf, alh<? extends kd<?>>> d = ali.b.a(alh::a, alh::a);
   public static final zg<wf, abo> a = zg.a(d, abo::b, kh.a.a.a(ze.a()), abo::e, abo::new);

   @Override
   public zr<abo> a() {
      return abs.b;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public List<kh.a> e() {
      return this.c;
   }
}
