import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class foh {
   public static final foh a = new foh(fog.b, foi.createDnsSrvRedirectHandler(), fod.a());
   private final fog b;
   private final foi c;
   private final fod d;

   @VisibleForTesting
   foh(fog $$0, foi $$1, fod $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<foe> a(fof $$0) {
      Optional<foe> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fof> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
