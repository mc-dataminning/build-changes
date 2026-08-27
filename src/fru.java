import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fru {
   public static final fru a = new fru(frt.b, frv.createDnsSrvRedirectHandler(), frq.a());
   private final frt b;
   private final frv c;
   private final frq d;

   @VisibleForTesting
   fru(frt $$0, frv $$1, frq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<frr> a(frs $$0) {
      Optional<frr> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<frs> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
