import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface djj<T extends dja> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(djh<T, U> var1, aqn<U> var2);

   void a(ehi var1, Consumer<T> var2);

   <U extends T> void a(djh<T, U> var1, ehi var2, aqn<U> var3);
}
