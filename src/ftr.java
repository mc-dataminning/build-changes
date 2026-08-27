import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ftr {
   public static final ftr a = new ftr(ftq.b, fts.createDnsSrvRedirectHandler(), ftn.a());
   private final ftq b;
   private final fts c;
   private final ftn d;

   @VisibleForTesting
   ftr(ftq $$0, fts $$1, ftn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fto> a(ftp $$0) {
      Optional<fto> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ftp> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
