import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface duz<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vr var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(duy.b<T> var1);

   duy<T> e();

   duz.a<T> a(jo<T> var1, duy.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends duz<T>> {
      DataResult<C> read(jo<T> var1, duy.d var2, duz.a<T> var3);
   }
}
