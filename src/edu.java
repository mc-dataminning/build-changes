import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface edu<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vw var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(edt.b<T> var1);

   edt<T> d();

   edt<T> e();

   edu.a<T> a(jk<T> var1, edt.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends edu<T>> {
      DataResult<C> read(jk<T> var1, edt.d var2, edu.a<T> var3);
   }
}
