import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dqh<T extends dpy> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dqf<T, U> var1, ava<U> var2);

   void a(eoq var1, Consumer<T> var2);

   <U extends T> void a(dqf<T, U> var1, eoq var2, ava<U> var3);
}
