import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eda<T extends ecr> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ecy<T, U> var1, axv<U> var2);

   void a(fcp var1, Consumer<T> var2);

   <U extends T> void a(ecy<T, U> var1, fcp var2, axv<U> var3);
}
