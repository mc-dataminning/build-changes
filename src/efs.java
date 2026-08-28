import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface efs<T extends efj> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(efq<T, U> var1, axz<U> var2);

   void a(ffl var1, Consumer<T> var2);

   <U extends T> void a(efq<T, U> var1, ffl var2, axz<U> var3);
}
