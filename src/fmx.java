import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fmx {
   public static final fmx a = new fmx(fmw.b, fmy.createDnsSrvRedirectHandler(), fmt.a());
   private final fmw b;
   private final fmy c;
   private final fmt d;

   @VisibleForTesting
   fmx(fmw $$0, fmy $$1, fmt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fmu> a(fmv $$0) {
      Optional<fmu> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fmv> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
