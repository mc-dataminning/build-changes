import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bpk<S> {
   private final Map<bpi<?>, bpo<S, ?>> a = new HashMap<>();

   public <T> void a(bpi<T> $$0, bpo<S, T> $$1) {
      bpo<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bpi<T> $$0, bpr<S> $$1, bpo.a<S, T> $$2) {
      this.a($$0, bpo.a($$1, $$2));
   }

   public <T> void a(bpi<T> $$0, bpr<S> $$1, bpo.b<T> $$2) {
      this.a($$0, bpo.a($$1, $$2));
   }

   @Nullable
   public <T> bpo<S, T> a(bpi<T> $$0) {
      return (bpo<S, T>)this.a.get($$0);
   }
}
