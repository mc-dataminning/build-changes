import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface djd<T extends diu> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(djb<T, U> var1, aqq<U> var2);

   void a(ehc var1, Consumer<T> var2);

   <U extends T> void a(djb<T, U> var1, ehc var2, aqq<U> var3);
}
