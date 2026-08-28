import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eca<T extends ebr> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(eby<T, U> var1, ayg<U> var2);

   void a(fbm var1, Consumer<T> var2);

   <U extends T> void a(eby<T, U> var1, fbm var2, ayg<U> var3);
}
