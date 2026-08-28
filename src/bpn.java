import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bpn<S> {
   private final Map<bpl<?>, bpr<S, ?>> a = new HashMap<>();

   public <T> void a(bpl<T> $$0, bpr<S, T> $$1) {
      bpr<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bpl<T> $$0, bpu<S> $$1, bpr.a<S, T> $$2) {
      this.a($$0, bpr.a($$1, $$2));
   }

   public <T> void a(bpl<T> $$0, bpu<S> $$1, bpr.b<T> $$2) {
      this.a($$0, bpr.a($$1, $$2));
   }

   @Nullable
   public <T> bpr<S, T> a(bpl<T> $$0) {
      return (bpr<S, T>)this.a.get($$0);
   }
}
