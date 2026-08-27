import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fnc {
   public static final fnc a = new fnc(fnb.b, fnd.createDnsSrvRedirectHandler(), fmy.a());
   private final fnb b;
   private final fnd c;
   private final fmy d;

   @VisibleForTesting
   fnc(fnb $$0, fnd $$1, fmy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fmz> a(fna $$0) {
      Optional<fmz> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fna> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
