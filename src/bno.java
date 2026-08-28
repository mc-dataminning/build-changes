import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bno<S> {
   private final Map<bnm<?>, bns<S, ?>> a = new HashMap<>();

   public <T> void a(bnm<T> $$0, bns<S, T> $$1) {
      bns<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnm<T> $$0, bnv<S> $$1, bns.a<S, T> $$2) {
      this.a($$0, bns.a($$1, $$2));
   }

   public <T> void a(bnm<T> $$0, bnv<S> $$1, bns.b<T> $$2) {
      this.a($$0, bns.a($$1, $$2));
   }

   @Nullable
   public <T> bns<S, T> a(bnm<T> $$0) {
      return (bns<S, T>)this.a.get($$0);
   }
}
