import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ebj<T extends eba> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ebh<T, U> var1, axl<U> var2);

   void a(fav var1, Consumer<T> var2);

   <U extends T> void a(ebh<T, U> var1, fav var2, axl<U> var3);
}
