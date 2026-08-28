import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dyn<T extends dye> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dyl<T, U> var1, axo<U> var2);

   void a(exz var1, Consumer<T> var2);

   <U extends T> void a(dyl<T, U> var1, exz var2, axo<U> var3);
}
