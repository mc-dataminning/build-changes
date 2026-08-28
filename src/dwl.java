import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwl<T extends dwc> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwj<T, U> var1, axl<U> var2);

   void a(evm var1, Consumer<T> var2);

   <U extends T> void a(dwj<T, U> var1, evm var2, axl<U> var3);
}
