import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class bop<S> {
   private final Map<bon<?>, bot<S, ?>> a = new HashMap<>();

   public <T> void a(bon<T> $$0, bot<S, T> $$1) {
      bot<S, ?> $$2 = this.a.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      }
   }

   public <T> void a(bon<T> $$0, bow<S> $$1, bot.a<S, T> $$2) {
      this.a($$0, bot.a($$1, $$2));
   }

   public <T> void a(bon<T> $$0, bow<S> $$1, bot.b<T> $$2) {
      this.a($$0, bot.a($$1, $$2));
   }

   @Nullable
   public <T> bot<S, T> a(bon<T> $$0) {
      return (bot<S, T>)this.a.get($$0);
   }
}
