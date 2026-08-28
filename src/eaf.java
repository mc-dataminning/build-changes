import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface eaf<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vl var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(eae.b<T> var1);

   eae<T> d();

   eae<T> e();

   eaf.a<T> a(jw<T> var1, eae.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends eaf<T>> {
      DataResult<C> read(jw<T> var1, eae.d var2, eaf.a<T> var3);
   }
}
