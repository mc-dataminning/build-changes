import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dpm<T extends dpd> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dpk<T, U> var1, auv<U> var2);

   void a(enu var1, Consumer<T> var2);

   <U extends T> void a(dpk<T, U> var1, enu var2, auv<U> var3);
}
