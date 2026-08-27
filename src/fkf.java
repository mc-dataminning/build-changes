import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fkf {
   public static final fkf a = new fkf(fke.b, fkg.createDnsSrvRedirectHandler(), fkb.a());
   private final fke b;
   private final fkg c;
   private final fkb d;

   @VisibleForTesting
   fkf(fke $$0, fkg $$1, fkb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fkc> a(fkd $$0) {
      Optional<fkc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fkd> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
