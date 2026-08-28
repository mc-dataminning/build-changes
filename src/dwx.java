import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwx<T extends dwo> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwv<T, U> var1, aws<U> var2);

   void a(ewc var1, Consumer<T> var2);

   <U extends T> void a(dwv<T, U> var1, ewc var2, aws<U> var3);
}
