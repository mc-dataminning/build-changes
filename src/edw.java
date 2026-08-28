import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface edw<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vy var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(edv.b<T> var1);

   edv<T> d();

   edv<T> e();

   edw.a<T> a(jl<T> var1, edv.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends edw<T>> {
      DataResult<C> read(jl<T> var1, edv.d var2, edw.a<T> var3);
   }
}
