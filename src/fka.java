import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fka {
   public static final fka a = new fka(fjz.b, fkb.createDnsSrvRedirectHandler(), fjw.a());
   private final fjz b;
   private final fkb c;
   private final fjw d;

   @VisibleForTesting
   fka(fjz $$0, fkb $$1, fjw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fjx> a(fjy $$0) {
      Optional<fjx> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fjy> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
