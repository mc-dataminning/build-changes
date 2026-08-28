import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bnf<S> {
   private final Map<bnd<?>, bnj<S, ?>> a = new HashMap<>();

   public <T> void a(bnd<T> $$0, bnj<S, T> $$1) {
      bnj<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnd<T> $$0, bnm<S> $$1, bnj.a<S, T> $$2) {
      this.a($$0, bnj.a($$1, $$2));
   }

   public <T> void a(bnd<T> $$0, bnm<S> $$1, bnj.b<T> $$2) {
      this.a($$0, bnj.a($$1, $$2));
   }

   @Nullable
   public <T> bnj<S, T> a(bnd<T> $$0) {
      return (bnj<S, T>)this.a.get($$0);
   }
}
