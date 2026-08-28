import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dzl<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vl var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dzk.b<T> var1);

   dzk<T> d();

   dzk<T> e();

   dzl.a<T> a(jw<T> var1, dzk.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dzl<T>> {
      DataResult<C> read(jw<T> var1, dzk.d var2, dzl.a<T> var3);
   }
}
