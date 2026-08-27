import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface djm<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(tu var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(djl.b<T> var1);

   djl<T> e();

   djm.a<T> a(ih<T> var1, djl.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends djm<T>> {
      DataResult<C> read(ih<T> var1, djl.d var2, djm.a<T> var3);
   }
}
