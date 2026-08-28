import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface ede<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vu var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(edd.b<T> var1);

   edd<T> d();

   edd<T> e();

   ede.a<T> a(jk<T> var1, edd.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends ede<T>> {
      DataResult<C> read(jk<T> var1, edd.d var2, ede.a<T> var3);
   }
}
