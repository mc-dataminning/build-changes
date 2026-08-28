import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface efh<T extends eey> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(eff<T, U> var1, axx<U> var2);

   void a(fex var1, Consumer<T> var2);

   <U extends T> void a(eff<T, U> var1, fex var2, axx<U> var3);
}
