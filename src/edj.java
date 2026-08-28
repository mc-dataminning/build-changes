import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface edj<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vu var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(edi.b<T> var1);

   edi<T> d();

   edi<T> e();

   edj.a<T> a(jk<T> var1, edi.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends edj<T>> {
      DataResult<C> read(jk<T> var1, edi.d var2, edj.a<T> var3);
   }
}
