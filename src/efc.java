import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface efc<T extends eet> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(efa<T, U> var1, axx<U> var2);

   void a(fes var1, Consumer<T> var2);

   <U extends T> void a(efa<T, U> var1, fes var2, axx<U> var3);
}
