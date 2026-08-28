import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ecg<T extends ebx> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ece<T, U> var1, ayq<U> var2);

   void a(fbs var1, Consumer<T> var2);

   <U extends T> void a(ece<T, U> var1, fbs var2, ayq<U> var3);
}
