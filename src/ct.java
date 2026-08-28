import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<czd> c) implements dz<czf> {
   public static final Codec<ct> a = kf.a(mb.ad).xmap(ct::new, ct::b);

   @Override
   public kt<czf> a() {
      return ku.Q;
   }

   public boolean a(cxg $$0, czf $$1) {
      Optional<jq<czd>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<czd> $$0) {
      return new ct($$0);
   }

   public ju<czd> b() {
      return this.c;
   }
}
