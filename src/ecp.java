import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface ecp<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vu var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(eco.b<T> var1);

   eco<T> d();

   eco<T> e();

   ecp.a<T> a(jj<T> var1, eco.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends ecp<T>> {
      DataResult<C> read(jj<T> var1, eco.d var2, ecp.a<T> var3);
   }
}
