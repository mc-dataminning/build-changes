import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dmf<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(uj var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dme.b<T> var1);

   dme<T> e();

   dmf.a<T> a(im<T> var1, dme.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dmf<T>> {
      DataResult<C> read(im<T> var1, dme.d var2, dmf.a<T> var3);
   }
}
