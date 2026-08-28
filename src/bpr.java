import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bpr<S> {
   private final Map<bpp<?>, bpv<S, ?>> a = new HashMap<>();

   public <T> void a(bpp<T> $$0, bpv<S, T> $$1) {
      bpv<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bpp<T> $$0, bpy<S> $$1, bpv.a<S, T> $$2) {
      this.a($$0, bpv.a($$1, $$2));
   }

   public <T> void a(bpp<T> $$0, bpy<S> $$1, bpv.b<T> $$2) {
      this.a($$0, bpv.a($$1, $$2));
   }

   @Nullable
   public <T> bpv<S, T> a(bpp<T> $$0) {
      return (bpv<S, T>)this.a.get($$0);
   }
}
