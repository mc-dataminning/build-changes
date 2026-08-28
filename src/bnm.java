import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bnm<S> {
   private final Map<bnk<?>, bnq<S, ?>> a = new HashMap<>();

   public <T> void a(bnk<T> $$0, bnq<S, T> $$1) {
      bnq<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnk<T> $$0, bnt<S> $$1, bnq.a<S, T> $$2) {
      this.a($$0, bnq.a($$1, $$2));
   }

   public <T> void a(bnk<T> $$0, bnt<S> $$1, bnq.b<T> $$2) {
      this.a($$0, bnq.a($$1, $$2));
   }

   @Nullable
   public <T> bnq<S, T> a(bnk<T> $$0) {
      return (bnq<S, T>)this.a.get($$0);
   }
}
