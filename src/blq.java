import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blq<S> {
   private final Map<blo<?>, blu<S, ?>> a = new HashMap<>();

   public <T> void a(blo<T> $$0, blu<S, T> $$1) {
      blu<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(blo<T> $$0, blx<S> $$1, blu.a<S, T> $$2) {
      this.a($$0, blu.a($$1, $$2));
   }

   public <T> void a(blo<T> $$0, blx<S> $$1, blu.b<T> $$2) {
      this.a($$0, blu.a($$1, $$2));
   }

   @Nullable
   public <T> blu<S, T> a(blo<T> $$0) {
      return (blu<S, T>)this.a.get($$0);
   }
}
