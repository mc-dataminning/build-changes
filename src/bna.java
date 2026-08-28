import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bna<S> {
   private final Map<bmy<?>, bne<S, ?>> a = new HashMap<>();

   public <T> void a(bmy<T> $$0, bne<S, T> $$1) {
      bne<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmy<T> $$0, bnh<S> $$1, bne.a<S, T> $$2) {
      this.a($$0, bne.a($$1, $$2));
   }

   public <T> void a(bmy<T> $$0, bnh<S> $$1, bne.b<T> $$2) {
      this.a($$0, bne.a($$1, $$2));
   }

   @Nullable
   public <T> bne<S, T> a(bmy<T> $$0) {
      return (bne<S, T>)this.a.get($$0);
   }
}
