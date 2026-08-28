import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bpc<S> {
   private final Map<bpa<?>, bpg<S, ?>> a = new HashMap<>();

   public <T> void a(bpa<T> $$0, bpg<S, T> $$1) {
      bpg<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bpa<T> $$0, bpj<S> $$1, bpg.a<S, T> $$2) {
      this.a($$0, bpg.a($$1, $$2));
   }

   public <T> void a(bpa<T> $$0, bpj<S> $$1, bpg.b<T> $$2) {
      this.a($$0, bpg.a($$1, $$2));
   }

   @Nullable
   public <T> bpg<S, T> a(bpa<T> $$0) {
      return (bpg<S, T>)this.a.get($$0);
   }
}
