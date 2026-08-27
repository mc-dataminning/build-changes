import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fjr {
   public static final fjr a = new fjr(fjq.b, fjs.createDnsSrvRedirectHandler(), fjn.a());
   private final fjq b;
   private final fjs c;
   private final fjn d;

   @VisibleForTesting
   fjr(fjq $$0, fjs $$1, fjn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fjo> a(fjp $$0) {
      Optional<fjo> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fjp> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
