import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bml<S> {
   private final Map<bmj<?>, bmp<S, ?>> a = new HashMap<>();

   public <T> void a(bmj<T> $$0, bmp<S, T> $$1) {
      bmp<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bmj<T> $$0, bms<S> $$1, bmp.a<S, T> $$2) {
      this.a($$0, bmp.a($$1, $$2));
   }

   public <T> void a(bmj<T> $$0, bms<S> $$1, bmp.b<T> $$2) {
      this.a($$0, bmp.a($$1, $$2));
   }

   @Nullable
   public <T> bmp<S, T> a(bmj<T> $$0) {
      return (bmp<S, T>)this.a.get($$0);
   }
}
