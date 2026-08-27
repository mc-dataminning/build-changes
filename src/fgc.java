import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fgc {
   public static final fgc a = new fgc(fgb.b, fgd.createDnsSrvRedirectHandler(), ffy.a());
   private final fgb b;
   private final fgd c;
   private final ffy d;

   @VisibleForTesting
   fgc(fgb $$0, fgd $$1, ffy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ffz> a(fga $$0) {
      Optional<ffz> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fga> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
