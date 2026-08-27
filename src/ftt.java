import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ftt {
   public static final ftt a = new ftt(fts.b, ftu.createDnsSrvRedirectHandler(), ftp.a());
   private final fts b;
   private final ftu c;
   private final ftp d;

   @VisibleForTesting
   ftt(fts $$0, ftu $$1, ftp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ftq> a(ftr $$0) {
      Optional<ftq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ftr> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
