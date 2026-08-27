import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dje<T extends div> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(djc<T, U> var1, aqj<U> var2);

   void a(ehd var1, Consumer<T> var2);

   <U extends T> void a(djc<T, U> var1, ehd var2, aqj<U> var3);
}
