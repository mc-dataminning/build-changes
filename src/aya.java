import com.google.common.base.Suppliers;
import java.util.function.Supplier;

@Deprecated
public class aya<T> {
   private final Supplier<T> a;

   public aya(Supplier<T> $$0) {
      this.a = Suppliers.memoize($$0::get);
   }

   public T a() {
      return this.a.get();
   }
}
