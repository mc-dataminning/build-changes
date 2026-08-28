import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwj<T extends dwa> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwh<T, U> var1, axk<U> var2);

   void a(evk var1, Consumer<T> var2);

   <U extends T> void a(dwh<T, U> var1, evk var2, axk<U> var3);
}
