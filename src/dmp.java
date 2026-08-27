import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dmp<T extends dmg> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dmn<T, U> var1, asm<U> var2);

   void a(ekw var1, Consumer<T> var2);

   <U extends T> void a(dmn<T, U> var1, ekw var2, asm<U> var3);
}
