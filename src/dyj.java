import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dyj<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(wg var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dyi.b<T> var1);

   dyi<T> d();

   dyi<T> e();

   dyj.a<T> a(jv<T> var1, dyi.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dyj<T>> {
      DataResult<C> read(jv<T> var1, dyi.d var2, dyj.a<T> var3);
   }
}
