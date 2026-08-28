import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmk<S> {
   private final Map<bmi<?>, bmo<S, ?>> a = new HashMap<>();

   public <T> void a(bmi<T> $$0, bmo<S, T> $$1) {
      bmo<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmi<T> $$0, bmr<S> $$1, bmo.a<S, T> $$2) {
      this.a($$0, bmo.a($$1, $$2));
   }

   public <T> void a(bmi<T> $$0, bmr<S> $$1, bmo.b<T> $$2) {
      this.a($$0, bmo.a($$1, $$2));
   }

   @Nullable
   public <T> bmo<S, T> a(bmi<T> $$0) {
      return (bmo<S, T>)this.a.get($$0);
   }
}
