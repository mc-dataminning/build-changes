import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface eab<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(ws var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(eaa.b<T> var1);

   eaa<T> d();

   eaa<T> e();

   eab.a<T> a(jv<T> var1, eaa.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends eab<T>> {
      DataResult<C> read(jv<T> var1, eaa.d var2, eab.a<T> var3);
   }
}
