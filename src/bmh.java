import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmh<S> {
   private final Map<bmf<?>, bml<S, ?>> a = new HashMap<>();

   public <T> void a(bmf<T> $$0, bml<S, T> $$1) {
      bml<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmf<T> $$0, bmo<S> $$1, bml.a<S, T> $$2) {
      this.a($$0, bml.a($$1, $$2));
   }

   public <T> void a(bmf<T> $$0, bmo<S> $$1, bml.b<T> $$2) {
      this.a($$0, bml.a($$1, $$2));
   }

   @Nullable
   public <T> bml<S, T> a(bmf<T> $$0) {
      return (bml<S, T>)this.a.get($$0);
   }
}
