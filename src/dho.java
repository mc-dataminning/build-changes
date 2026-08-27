import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dho<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(sh var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dhn.b<T> var1);

   dhn<T> e();

   dho.a<T> a(hk<T> var1, dhn.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dho<T>> {
      DataResult<C> read(hk<T> var1, dhn.d var2, dho.a<T> var3);
   }
}
