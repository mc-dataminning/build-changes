import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dzw<T extends dzn> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dzu<T, U> var1, axw<U> var2);

   void a(ezi var1, Consumer<T> var2);

   <U extends T> void a(dzu<T, U> var1, ezi var2, axw<U> var3);
}
