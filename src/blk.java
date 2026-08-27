import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blk<S> {
   private final Map<bli<?>, blo<S, ?>> a = new HashMap<>();

   public <T> void a(bli<T> $$0, blo<S, T> $$1) {
      blo<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bli<T> $$0, blr<S> $$1, blo.a<S, T> $$2) {
      this.a($$0, blo.a($$1, $$2));
   }

   public <T> void a(bli<T> $$0, blr<S> $$1, blo.b<T> $$2) {
      this.a($$0, blo.a($$1, $$2));
   }

   @Nullable
   public <T> blo<S, T> a(bli<T> $$0) {
      return (blo<S, T>)this.a.get($$0);
   }
}
