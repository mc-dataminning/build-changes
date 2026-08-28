import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blt<S> {
   private final Map<blr<?>, blx<S, ?>> a = new HashMap<>();

   public <T> void a(blr<T> $$0, blx<S, T> $$1) {
      blx<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(blr<T> $$0, bma<S> $$1, blx.a<S, T> $$2) {
      this.a($$0, blx.a($$1, $$2));
   }

   public <T> void a(blr<T> $$0, bma<S> $$1, blx.b<T> $$2) {
      this.a($$0, blx.a($$1, $$2));
   }

   @Nullable
   public <T> blx<S, T> a(blr<T> $$0) {
      return (blx<S, T>)this.a.get($$0);
   }
}
