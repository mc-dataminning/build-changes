import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface duh<T extends dty> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(duf<T, U> var1, awj<U> var2);

   void a(eta var1, Consumer<T> var2);

   <U extends T> void a(duf<T, U> var1, eta var2, awj<U> var3);
}
