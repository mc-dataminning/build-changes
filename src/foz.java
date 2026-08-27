import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class foz {
   public static final foz a = new foz(foy.b, fpa.createDnsSrvRedirectHandler(), fov.a());
   private final foy b;
   private final fpa c;
   private final fov d;

   @VisibleForTesting
   foz(foy $$0, fpa $$1, fov $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fow> a(fox $$0) {
      Optional<fow> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fox> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
