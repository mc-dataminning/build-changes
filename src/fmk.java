import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fmk {
   public static final fmk a = new fmk(fmj.b, fml.createDnsSrvRedirectHandler(), fmg.a());
   private final fmj b;
   private final fml c;
   private final fmg d;

   @VisibleForTesting
   fmk(fmj $$0, fml $$1, fmg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fmh> a(fmi $$0) {
      Optional<fmh> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fmi> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
