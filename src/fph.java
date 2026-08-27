import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fph {
   public static final fph a = new fph(fpg.b, fpi.createDnsSrvRedirectHandler(), fpd.a());
   private final fpg b;
   private final fpi c;
   private final fpd d;

   @VisibleForTesting
   fph(fpg $$0, fpi $$1, fpd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fpe> a(fpf $$0) {
      Optional<fpe> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fpf> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
