import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<cxy> c) implements dz<cya> {
   public static final Codec<ct> a = kf.a(lz.ad).xmap(ct::new, ct::b);

   @Override
   public kt<cya> a() {
      return ku.Q;
   }

   public boolean a(cwb $$0, cya $$1) {
      Optional<jq<cxy>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<cxy> $$0) {
      return new ct($$0);
   }

   public ju<cxy> b() {
      return this.c;
   }
}
