import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface ece<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vs var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(ecd.b<T> var1);

   ecd<T> d();

   ecd<T> e();

   ece.a<T> a(jj<T> var1, ecd.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends ece<T>> {
      DataResult<C> read(jj<T> var1, ecd.d var2, ece.a<T> var3);
   }
}
