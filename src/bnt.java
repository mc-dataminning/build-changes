import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bnt<S> {
   private final Map<bnr<?>, bnx<S, ?>> a = new HashMap<>();

   public <T> void a(bnr<T> $$0, bnx<S, T> $$1) {
      bnx<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bnr<T> $$0, boa<S> $$1, bnx.a<S, T> $$2) {
      this.a($$0, bnx.a($$1, $$2));
   }

   public <T> void a(bnr<T> $$0, boa<S> $$1, bnx.b<T> $$2) {
      this.a($$0, bnx.a($$1, $$2));
   }

   @Nullable
   public <T> bnx<S, T> a(bnr<T> $$0) {
      return (bnx<S, T>)this.a.get($$0);
   }
}
