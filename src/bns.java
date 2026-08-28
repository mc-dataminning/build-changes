import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bns<S> {
   private final Map<bnq<?>, bnw<S, ?>> a = new HashMap<>();

   public <T> void a(bnq<T> $$0, bnw<S, T> $$1) {
      bnw<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnq<T> $$0, bnz<S> $$1, bnw.a<S, T> $$2) {
      this.a($$0, bnw.a($$1, $$2));
   }

   public <T> void a(bnq<T> $$0, bnz<S> $$1, bnw.b<T> $$2) {
      this.a($$0, bnw.a($$1, $$2));
   }

   @Nullable
   public <T> bnw<S, T> a(bnq<T> $$0) {
      return (bnw<S, T>)this.a.get($$0);
   }
}
