import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bou<S> {
   private final Map<bos<?>, boy<S, ?>> a = new HashMap<>();

   public <T> void a(bos<T> $$0, boy<S, T> $$1) {
      boy<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bos<T> $$0, bpb<S> $$1, boy.a<S, T> $$2) {
      this.a($$0, boy.a($$1, $$2));
   }

   public <T> void a(bos<T> $$0, bpb<S> $$1, boy.b<T> $$2) {
      this.a($$0, boy.a($$1, $$2));
   }

   @Nullable
   public <T> boy<S, T> a(bos<T> $$0) {
      return (boy<S, T>)this.a.get($$0);
   }
}
