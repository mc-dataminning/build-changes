import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface diz<T extends diq> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dix<T, U> var1, aqg<U> var2);

   void a(egy var1, Consumer<T> var2);

   <U extends T> void a(dix<T, U> var1, egy var2, aqg<U> var3);
}
