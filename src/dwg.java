import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwg<T extends dvx> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwe<T, U> var1, axh<U> var2);

   void a(evh var1, Consumer<T> var2);

   <U extends T> void a(dwe<T, U> var1, evh var2, axh<U> var3);
}
