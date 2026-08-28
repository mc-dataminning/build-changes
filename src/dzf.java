import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dzf<T extends dyw> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dzd<T, U> var1, axr<U> var2);

   void a(eyr var1, Consumer<T> var2);

   <U extends T> void a(dzd<T, U> var1, eyr var2, axr<U> var3);
}
