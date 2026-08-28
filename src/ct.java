import com.mojang.serialization.Codec;
import java.util.Optional;

public record ct(ju<czl> c) implements dz<czn> {
   public static final Codec<ct> a = kf.a(mb.ad).xmap(ct::new, ct::b);

   @Override
   public kt<czn> a() {
      return ku.Q;
   }

   public boolean a(cxo $$0, czn $$1) {
      Optional<jq<czl>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cv a(ju<czl> $$0) {
      return new ct($$0);
   }

   public ju<czl> b() {
      return this.c;
   }
}
