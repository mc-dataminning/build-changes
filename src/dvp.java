import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dvp<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vv var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dvo.b<T> var1);

   dvo<T> e();

   dvp.a<T> a(jr<T> var1, dvo.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dvp<T>> {
      DataResult<C> read(jr<T> var1, dvo.d var2, dvp.a<T> var3);
   }
}
