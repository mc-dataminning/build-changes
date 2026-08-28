import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bot<S> {
   private final Map<bor<?>, box<S, ?>> a = new HashMap<>();

   public <T> void a(bor<T> $$0, box<S, T> $$1) {
      box<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bor<T> $$0, bpa<S> $$1, box.a<S, T> $$2) {
      this.a($$0, box.a($$1, $$2));
   }

   public <T> void a(bor<T> $$0, bpa<S> $$1, box.b<T> $$2) {
      this.a($$0, box.a($$1, $$2));
   }

   @Nullable
   public <T> box<S, T> a(bor<T> $$0) {
      return (box<S, T>)this.a.get($$0);
   }
}
