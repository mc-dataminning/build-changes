import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class blm<S> {
   private final Map<blk<?>, blq<S, ?>> a = new HashMap<>();

   public <T> void a(blk<T> $$0, blq<S, T> $$1) {
      blq<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(blk<T> $$0, blt<S> $$1, blq.a<S, T> $$2) {
      this.a($$0, blq.a($$1, $$2));
   }

   public <T> void a(blk<T> $$0, blt<S> $$1, blq.b<T> $$2) {
      this.a($$0, blq.a($$1, $$2));
   }

   @Nullable
   public <T> blq<S, T> a(blk<T> $$0) {
      return (blq<S, T>)this.a.get($$0);
   }
}
