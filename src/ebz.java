import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ebz<T extends ebq> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ebx<T, U> var1, ayq<U> var2);

   void a(fbn var1, Consumer<T> var2);

   <U extends T> void a(ebx<T, U> var1, fbn var2, ayq<U> var3);
}
