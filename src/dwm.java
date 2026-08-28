import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dwm<T extends dwd> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dwk<T, U> var1, axl<U> var2);

   void a(evn var1, Consumer<T> var2);

   <U extends T> void a(dwk<T, U> var1, evn var2, axl<U> var3);
}
