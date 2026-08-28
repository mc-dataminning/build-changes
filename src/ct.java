import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<cyc> c) implements dz<cye> {
   public static final Codec<ct> a = kf.a(ma.ad).xmap(ct::new, ct::b);

   @Override
   public kt<cye> a() {
      return ku.Q;
   }

   public boolean a(cwf $$0, cye $$1) {
      Optional<jq<cyc>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<cyc> $$0) {
      return new ct($$0);
   }

   public ju<cyc> b() {
      return this.c;
   }
}
