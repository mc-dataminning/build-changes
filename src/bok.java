import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bok<S> {
   private final Map<boi<?>, boo<S, ?>> a = new HashMap<>();

   public <T> void a(boi<T> $$0, boo<S, T> $$1) {
      boo<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(boi<T> $$0, bor<S> $$1, boo.a<S, T> $$2) {
      this.a($$0, boo.a($$1, $$2));
   }

   public <T> void a(boi<T> $$0, bor<S> $$1, boo.b<T> $$2) {
      this.a($$0, boo.a($$1, $$2));
   }

   @Nullable
   public <T> boo<S, T> a(boi<T> $$0) {
      return (boo<S, T>)this.a.get($$0);
   }
}
