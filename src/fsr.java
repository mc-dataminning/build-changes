import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fsr {
   public static final fsr a = new fsr(fsq.b, fss.createDnsSrvRedirectHandler(), fsn.a());
   private final fsq b;
   private final fss c;
   private final fsn d;

   @VisibleForTesting
   fsr(fsq $$0, fss $$1, fsn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fso> a(fsp $$0) {
      Optional<fso> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fsp> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
