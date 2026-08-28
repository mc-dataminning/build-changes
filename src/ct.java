import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<czh> c) implements dz<czj> {
   public static final Codec<ct> a = kf.a(mb.ad).xmap(ct::new, ct::b);

   @Override
   public kt<czj> a() {
      return ku.Q;
   }

   public boolean a(cxk $$0, czj $$1) {
      Optional<jq<czh>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<czh> $$0) {
      return new ct($$0);
   }

   public ju<czh> b() {
      return this.c;
   }
}
