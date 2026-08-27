import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dnh<T extends dmy> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dnf<T, U> var1, atc<U> var2);

   void a(elo var1, Consumer<T> var2);

   <U extends T> void a(dnf<T, U> var1, elo var2, atc<U> var3);
}
