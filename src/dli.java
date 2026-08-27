import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dli<T extends dkz> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dlg<T, U> var1, asb<U> var2);

   void a(ejp var1, Consumer<T> var2);

   <U extends T> void a(dlg<T, U> var1, ejp var2, asb<U> var3);
}
