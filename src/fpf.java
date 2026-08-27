import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fpf {
   public static final fpf a = new fpf(fpe.b, fpg.createDnsSrvRedirectHandler(), fpb.a());
   private final fpe b;
   private final fpg c;
   private final fpb d;

   @VisibleForTesting
   fpf(fpe $$0, fpg $$1, fpb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fpc> a(fpd $$0) {
      Optional<fpc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fpd> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
