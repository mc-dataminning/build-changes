import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwq<T extends dwh> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwo<T, U> var1, awq<U> var2);

   void a(evu var1, Consumer<T> var2);

   <U extends T> void a(dwo<T, U> var1, evu var2, awq<U> var3);
}
