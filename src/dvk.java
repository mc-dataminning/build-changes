import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dvk<T extends dvb> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(dvi<T, U> var1, awr<U> var2);

   void a(euf var1, Consumer<T> var2);

   <U extends T> void a(dvi<T, U> var1, euf var2, awr<U> var3);
}
