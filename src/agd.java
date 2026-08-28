import java.util.Optional;

public record agd(wy b, Optional<jz> c) implements zf<abu> {
   public static final yw<wj, agd> a = yw.a(xa.b, agd::b, yu.a(jz.h), agd::e, agd::new);

   @Override
   public zh<agd> a() {
      return agn.be;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public Optional<jz> e() {
      return this.c;
   }
}
