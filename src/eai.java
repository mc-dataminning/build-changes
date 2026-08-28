import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface eai<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(ws var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(eah.b<T> var1);

   eah<T> d();

   eah<T> e();

   eai.a<T> a(jv<T> var1, eah.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends eai<T>> {
      DataResult<C> read(jv<T> var1, eah.d var2, eai.a<T> var3);
   }
}
