import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dzq<T extends dzh> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dzo<T, U> var1, axv<U> var2);

   void a(ezc var1, Consumer<T> var2);

   <U extends T> void a(dzo<T, U> var1, ezc var2, axv<U> var3);
}
