import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blx<S> {
   private final Map<blv<?>, bmb<S, ?>> a = new HashMap<>();

   public <T> void a(blv<T> $$0, bmb<S, T> $$1) {
      bmb<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(blv<T> $$0, bme<S> $$1, bmb.a<S, T> $$2) {
      this.a($$0, bmb.a($$1, $$2));
   }

   public <T> void a(blv<T> $$0, bme<S> $$1, bmb.b<T> $$2) {
      this.a($$0, bmb.a($$1, $$2));
   }

   @Nullable
   public <T> bmb<S, T> a(blv<T> $$0) {
      return (bmb<S, T>)this.a.get($$0);
   }
}
