import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface drf<T extends dqw> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(drd<T, U> var1, avj<U> var2);

   void a(epo var1, Consumer<T> var2);

   <U extends T> void a(drd<T, U> var1, epo var2, avj<U> var3);
}
