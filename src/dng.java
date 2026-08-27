import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dng<T extends dmx> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dne<T, U> var1, atb<U> var2);

   void a(eln var1, Consumer<T> var2);

   <U extends T> void a(dne<T, U> var1, eln var2, atb<U> var3);
}
