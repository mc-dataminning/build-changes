import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fkk {
   public static final fkk a = new fkk(fkj.b, fkl.createDnsSrvRedirectHandler(), fkg.a());
   private final fkj b;
   private final fkl c;
   private final fkg d;

   @VisibleForTesting
   fkk(fkj $$0, fkl $$1, fkg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fkh> a(fki $$0) {
      Optional<fkh> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fki> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
