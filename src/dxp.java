import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dxp<T extends dxg> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dxn<T, U> var1, axa<U> var2);

   void a(ewx var1, Consumer<T> var2);

   <U extends T> void a(dxn<T, U> var1, ewx var2, axa<U> var3);
}
