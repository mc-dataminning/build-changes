import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwk<T extends dwb> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwi<T, U> var1, axk<U> var2);

   void a(evl var1, Consumer<T> var2);

   <U extends T> void a(dwi<T, U> var1, evl var2, axk<U> var3);
}
