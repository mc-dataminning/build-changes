import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface ebc<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vr var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(ebb.b<T> var1);

   ebb<T> d();

   ebb<T> e();

   ebc.a<T> a(jx<T> var1, ebb.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends ebc<T>> {
      DataResult<C> read(jx<T> var1, ebb.d var2, ebc.a<T> var3);
   }
}
