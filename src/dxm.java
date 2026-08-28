import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dxm<T extends dxd> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dxk<T, U> var1, awz<U> var2);

   void a(ewr var1, Consumer<T> var2);

   <U extends T> void a(dxk<T, U> var1, ewr var2, awz<U> var3);
}
