import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eec<T extends edt> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(eea<T, U> var1, axv<U> var2);

   void a(fdr var1, Consumer<T> var2);

   <U extends T> void a(eea<T, U> var1, fdr var2, axv<U> var3);
}
