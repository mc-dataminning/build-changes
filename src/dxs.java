import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dxs<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(we var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dxr.b<T> var1);

   dxr<T> d();

   dxr<T> e();

   dxs.a<T> a(ju<T> var1, dxr.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dxs<T>> {
      DataResult<C> read(ju<T> var1, dxr.d var2, dxs.a<T> var3);
   }
}
