import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmg<S> {
   private final Map<bme<?>, bmk<S, ?>> a = new HashMap<>();

   public <T> void a(bme<T> $$0, bmk<S, T> $$1) {
      bmk<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bme<T> $$0, bmn<S> $$1, bmk.a<S, T> $$2) {
      this.a($$0, bmk.a($$1, $$2));
   }

   public <T> void a(bme<T> $$0, bmn<S> $$1, bmk.b<T> $$2) {
      this.a($$0, bmk.a($$1, $$2));
   }

   @Nullable
   public <T> bmk<S, T> a(bme<T> $$0) {
      return (bmk<S, T>)this.a.get($$0);
   }
}
