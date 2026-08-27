import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dsn<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vs var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dsm.b<T> var1);

   dsm<T> e();

   dsn.a<T> a(ja<T> var1, dsm.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dsn<T>> {
      DataResult<C> read(ja<T> var1, dsm.d var2, dsn.a<T> var3);
   }
}
