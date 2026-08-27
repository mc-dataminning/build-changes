import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fpg {
   public static final fpg a = new fpg(fpf.b, fph.createDnsSrvRedirectHandler(), fpc.a());
   private final fpf b;
   private final fph c;
   private final fpc d;

   @VisibleForTesting
   fpg(fpf $$0, fph $$1, fpc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fpd> a(fpe $$0) {
      Optional<fpd> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fpe> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
