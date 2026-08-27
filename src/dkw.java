import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dkw<T extends dkn> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dku<T, U> var1, arx<U> var2);

   void a(ejd var1, Consumer<T> var2);

   <U extends T> void a(dku<T, U> var1, ejd var2, arx<U> var3);
}
