import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dva<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vr var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(duz.b<T> var1);

   duz<T> e();

   dva.a<T> a(jo<T> var1, duz.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dva<T>> {
      DataResult<C> read(jo<T> var1, duz.d var2, dva.a<T> var3);
   }
}
