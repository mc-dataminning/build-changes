import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class frm {
   public static final frm a = new frm(frl.b, frn.createDnsSrvRedirectHandler(), fri.a());
   private final frl b;
   private final frn c;
   private final fri d;

   @VisibleForTesting
   frm(frl $$0, frn $$1, fri $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<frj> a(frk $$0) {
      Optional<frj> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<frk> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
