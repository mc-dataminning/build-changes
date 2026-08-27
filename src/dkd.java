import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dkd<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(ty var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dkc.b<T> var1);

   dkc<T> e();

   dkd.a<T> a(il<T> var1, dkc.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dkd<T>> {
      DataResult<C> read(il<T> var1, dkc.d var2, dkd.a<T> var3);
   }
}
