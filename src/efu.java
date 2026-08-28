import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface efu<T extends efl> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(efs<T, U> var1, ayb<U> var2);

   void a(ffn var1, Consumer<T> var2);

   <U extends T> void a(efs<T, U> var1, ffn var2, ayb<U> var3);
}
