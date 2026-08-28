import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ebk<T extends ebb> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ebi<T, U> var1, axl<U> var2);

   void a(faw var1, Consumer<T> var2);

   <U extends T> void a(ebi<T, U> var1, faw var2, axl<U> var3);
}
