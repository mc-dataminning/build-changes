import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dti<T extends dsz> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dtg<T, U> var1, avx<U> var2);

   void a(erv var1, Consumer<T> var2);

   <U extends T> void a(dtg<T, U> var1, erv var2, avx<U> var3);
}
