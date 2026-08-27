import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class flf {
   public static final flf a = new flf(fle.b, flg.createDnsSrvRedirectHandler(), flb.a());
   private final fle b;
   private final flg c;
   private final flb d;

   @VisibleForTesting
   flf(fle $$0, flg $$1, flb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<flc> a(fld $$0) {
      Optional<flc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fld> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
