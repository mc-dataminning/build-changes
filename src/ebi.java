import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ebi<T extends eaz> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ebg<T, U> var1, axl<U> var2);

   void a(fau var1, Consumer<T> var2);

   <U extends T> void a(ebg<T, U> var1, fau var2, axl<U> var3);
}
