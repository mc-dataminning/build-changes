import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blw<S> {
   private final Map<blu<?>, bma<S, ?>> a = new HashMap<>();

   public <T> void a(blu<T> $$0, bma<S, T> $$1) {
      bma<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(blu<T> $$0, bmd<S> $$1, bma.a<S, T> $$2) {
      this.a($$0, bma.a($$1, $$2));
   }

   public <T> void a(blu<T> $$0, bmd<S> $$1, bma.b<T> $$2) {
      this.a($$0, bma.a($$1, $$2));
   }

   @Nullable
   public <T> bma<S, T> a(blu<T> $$0) {
      return (bma<S, T>)this.a.get($$0);
   }
}
