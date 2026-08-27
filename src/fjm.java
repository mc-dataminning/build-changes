import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fjm {
   public static final fjm a = new fjm(fjl.b, fjn.createDnsSrvRedirectHandler(), fji.a());
   private final fjl b;
   private final fjn c;
   private final fji d;

   @VisibleForTesting
   fjm(fjl $$0, fjn $$1, fji $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fjj> a(fjk $$0) {
      Optional<fjj> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fjk> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
