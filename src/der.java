import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface der<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(sf var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(deq.b<T> var1);

   deq<T> e();

   der.a<T> a(hj<T> var1, deq.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends der<T>> {
      DataResult<C> read(hj<T> var1, deq.d var2, der.a<T> var3);
   }
}
