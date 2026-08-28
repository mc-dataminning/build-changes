import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<cyj> c) implements dz<cyl> {
   public static final Codec<ct> a = kf.a(ma.ad).xmap(ct::new, ct::b);

   @Override
   public kt<cyl> a() {
      return ku.Q;
   }

   public boolean a(cwm $$0, cyl $$1) {
      Optional<jq<cyj>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<cyj> $$0) {
      return new ct($$0);
   }

   public ju<cyj> b() {
      return this.c;
   }
}
