import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fkm {
   public static final fkm a = new fkm(fkl.b, fkn.createDnsSrvRedirectHandler(), fki.a());
   private final fkl b;
   private final fkn c;
   private final fki d;

   @VisibleForTesting
   fkm(fkl $$0, fkn $$1, fki $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fkj> a(fkk $$0) {
      Optional<fkj> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fkk> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
