import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmm<S> {
   private final Map<bmk<?>, bmq<S, ?>> a = new HashMap<>();

   public <T> void a(bmk<T> $$0, bmq<S, T> $$1) {
      bmq<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmk<T> $$0, bmt<S> $$1, bmq.a<S, T> $$2) {
      this.a($$0, bmq.a($$1, $$2));
   }

   public <T> void a(bmk<T> $$0, bmt<S> $$1, bmq.b<T> $$2) {
      this.a($$0, bmq.a($$1, $$2));
   }

   @Nullable
   public <T> bmq<S, T> a(bmk<T> $$0) {
      return (bmq<S, T>)this.a.get($$0);
   }
}
