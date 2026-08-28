import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmj<S> {
   private final Map<bmh<?>, bmn<S, ?>> a = new HashMap<>();

   public <T> void a(bmh<T> $$0, bmn<S, T> $$1) {
      bmn<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmh<T> $$0, bmq<S> $$1, bmn.a<S, T> $$2) {
      this.a($$0, bmn.a($$1, $$2));
   }

   public <T> void a(bmh<T> $$0, bmq<S> $$1, bmn.b<T> $$2) {
      this.a($$0, bmn.a($$1, $$2));
   }

   @Nullable
   public <T> bmn<S, T> a(bmh<T> $$0) {
      return (bmn<S, T>)this.a.get($$0);
   }
}
