import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bnu<S> {
   private final Map<bns<?>, bny<S, ?>> a = new HashMap<>();

   public <T> void a(bns<T> $$0, bny<S, T> $$1) {
      bny<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bns<T> $$0, bob<S> $$1, bny.a<S, T> $$2) {
      this.a($$0, bny.a($$1, $$2));
   }

   public <T> void a(bns<T> $$0, bob<S> $$1, bny.b<T> $$2) {
      this.a($$0, bny.a($$1, $$2));
   }

   @Nullable
   public <T> bny<S, T> a(bns<T> $$0) {
      return (bny<S, T>)this.a.get($$0);
   }
}
