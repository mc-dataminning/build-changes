import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dhu<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(sl var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dht.b<T> var1);

   dht<T> e();

   dhu.a<T> a(hl<T> var1, dht.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dhu<T>> {
      DataResult<C> read(hl<T> var1, dht.d var2, dhu.a<T> var3);
   }
}
