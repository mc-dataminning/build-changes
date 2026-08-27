import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dou<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(us var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dot.b<T> var1);

   dot<T> e();

   dou.a<T> a(iq<T> var1, dot.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dou<T>> {
      DataResult<C> read(iq<T> var1, dot.d var2, dou.a<T> var3);
   }
}
