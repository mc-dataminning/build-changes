import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eev<T extends eem> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(eet<T, U> var1, axx<U> var2);

   void a(fel var1, Consumer<T> var2);

   <U extends T> void a(eet<T, U> var1, fel var2, axx<U> var3);
}
