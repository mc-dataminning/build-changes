import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dkb<T extends djs> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(djz<T, U> var1, arn<U> var2);

   void a(eia var1, Consumer<T> var2);

   <U extends T> void a(djz<T, U> var1, eia var2, arn<U> var3);
}
