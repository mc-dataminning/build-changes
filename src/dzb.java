import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dzb<T extends dys> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dyz<T, U> var1, axp<U> var2);

   void a(eyn var1, Consumer<T> var2);

   <U extends T> void a(dyz<T, U> var1, eyn var2, axp<U> var3);
}
