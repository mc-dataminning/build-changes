import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface drd<T extends dqu> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(drb<T, U> var1, avj<U> var2);

   void a(epm var1, Consumer<T> var2);

   <U extends T> void a(drb<T, U> var1, epm var2, avj<U> var3);
}
