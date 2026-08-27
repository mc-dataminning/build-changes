import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dtr<T extends dti> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dtp<T, U> var1, avz<U> var2);

   void a(ese var1, Consumer<T> var2);

   <U extends T> void a(dtp<T, U> var1, ese var2, avz<U> var3);
}
