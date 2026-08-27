import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dpf<T extends dow> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dpd<T, U> var1, auu<U> var2);

   void a(enn var1, Consumer<T> var2);

   <U extends T> void a(dpd<T, U> var1, enn var2, auu<U> var3);
}
