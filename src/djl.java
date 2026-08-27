import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface djl<T extends djc> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(djj<T, U> var1, aqp<U> var2);

   void a(ehk var1, Consumer<T> var2);

   <U extends T> void a(djj<T, U> var1, ehk var2, aqp<U> var3);
}
