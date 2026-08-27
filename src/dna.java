import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dna<T extends dmr> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dmy<T, U> var1, asw<U> var2);

   void a(elh var1, Consumer<T> var2);

   <U extends T> void a(dmy<T, U> var1, elh var2, asw<U> var3);
}
