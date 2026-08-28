import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eah<T extends dzy> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(eaf<T, U> var1, axy<U> var2);

   void a(ezt var1, Consumer<T> var2);

   <U extends T> void a(eaf<T, U> var1, ezt var2, axy<U> var3);
}
