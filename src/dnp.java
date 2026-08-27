import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dnp<T extends dng> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dnn<T, U> var1, atd<U> var2);

   void a(elx var1, Consumer<T> var2);

   <U extends T> void a(dnn<T, U> var1, elx var2, atd<U> var3);
}
