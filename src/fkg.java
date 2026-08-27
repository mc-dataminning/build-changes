import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fkg {
   public static final fkg a = new fkg(fkf.b, fkh.createDnsSrvRedirectHandler(), fkc.a());
   private final fkf b;
   private final fkh c;
   private final fkc d;

   @VisibleForTesting
   fkg(fkf $$0, fkh $$1, fkc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fkd> a(fke $$0) {
      Optional<fkd> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fke> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
