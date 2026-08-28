import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bmi<S> {
   private final Map<bmg<?>, bmm<S, ?>> a = new HashMap<>();

   public <T> void a(bmg<T> $$0, bmm<S, T> $$1) {
      bmm<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmg<T> $$0, bmp<S> $$1, bmm.a<S, T> $$2) {
      this.a($$0, bmm.a($$1, $$2));
   }

   public <T> void a(bmg<T> $$0, bmp<S> $$1, bmm.b<T> $$2) {
      this.a($$0, bmm.a($$1, $$2));
   }

   @Nullable
   public <T> bmm<S, T> a(bmg<T> $$0) {
      return (bmm<S, T>)this.a.get($$0);
   }
}
