import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<czm> c) implements dz<czo> {
   public static final Codec<ct> a = kf.a(mb.ad).xmap(ct::new, ct::b);

   @Override
   public kt<czo> a() {
      return ku.Q;
   }

   public boolean a(cxp $$0, czo $$1) {
      Optional<jq<czm>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<czm> $$0) {
      return new ct($$0);
   }

   public ju<czm> b() {
      return this.c;
   }
}
