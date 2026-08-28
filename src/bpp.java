import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bpp<S> {
   private final Map<bpn<?>, bpt<S, ?>> a = new HashMap<>();

   public <T> void a(bpn<T> $$0, bpt<S, T> $$1) {
      bpt<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bpn<T> $$0, bpw<S> $$1, bpt.a<S, T> $$2) {
      this.a($$0, bpt.a($$1, $$2));
   }

   public <T> void a(bpn<T> $$0, bpw<S> $$1, bpt.b<T> $$2) {
      this.a($$0, bpt.a($$1, $$2));
   }

   @Nullable
   public <T> bpt<S, T> a(bpn<T> $$0) {
      return (bpt<S, T>)this.a.get($$0);
   }
}
