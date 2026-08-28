import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmf<S> {
   private final Map<bmd<?>, bmj<S, ?>> a = new HashMap<>();

   public <T> void a(bmd<T> $$0, bmj<S, T> $$1) {
      bmj<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmd<T> $$0, bmm<S> $$1, bmj.a<S, T> $$2) {
      this.a($$0, bmj.a($$1, $$2));
   }

   public <T> void a(bmd<T> $$0, bmm<S> $$1, bmj.b<T> $$2) {
      this.a($$0, bmj.a($$1, $$2));
   }

   @Nullable
   public <T> bmj<S, T> a(bmd<T> $$0) {
      return (bmj<S, T>)this.a.get($$0);
   }
}
