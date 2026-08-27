import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blc<S> {
   private final Map<bla<?>, blg<S, ?>> a = new HashMap<>();

   public <T> void a(bla<T> $$0, blg<S, T> $$1) {
      blg<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bla<T> $$0, blj<S> $$1, blg.a<S, T> $$2) {
      this.a($$0, blg.a($$1, $$2));
   }

   public <T> void a(bla<T> $$0, blj<S> $$1, blg.b<T> $$2) {
      this.a($$0, blg.a($$1, $$2));
   }

   @Nullable
   public <T> blg<S, T> a(bla<T> $$0) {
      return (blg<S, T>)this.a.get($$0);
   }
}
