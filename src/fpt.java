import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fpt {
   public static final fpt a = new fpt(fps.b, fpu.createDnsSrvRedirectHandler(), fpp.a());
   private final fps b;
   private final fpu c;
   private final fpp d;

   @VisibleForTesting
   fpt(fps $$0, fpu $$1, fpp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fpq> a(fpr $$0) {
      Optional<fpq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fpr> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
