import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bni<S> {
   private final Map<bng<?>, bnm<S, ?>> a = new HashMap<>();

   public <T> void a(bng<T> $$0, bnm<S, T> $$1) {
      bnm<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bng<T> $$0, bnp<S> $$1, bnm.a<S, T> $$2) {
      this.a($$0, bnm.a($$1, $$2));
   }

   public <T> void a(bng<T> $$0, bnp<S> $$1, bnm.b<T> $$2) {
      this.a($$0, bnm.a($$1, $$2));
   }

   @Nullable
   public <T> bnm<S, T> a(bng<T> $$0) {
      return (bnm<S, T>)this.a.get($$0);
   }
}
