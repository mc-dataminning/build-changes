import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bnv<S> {
   private final Map<bnt<?>, bnz<S, ?>> a = new HashMap<>();

   public <T> void a(bnt<T> $$0, bnz<S, T> $$1) {
      bnz<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnt<T> $$0, boc<S> $$1, bnz.a<S, T> $$2) {
      this.a($$0, bnz.a($$1, $$2));
   }

   public <T> void a(bnt<T> $$0, boc<S> $$1, bnz.b<T> $$2) {
      this.a($$0, bnz.a($$1, $$2));
   }

   @Nullable
   public <T> bnz<S, T> a(bnt<T> $$0) {
      return (bnz<S, T>)this.a.get($$0);
   }
}
