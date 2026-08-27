import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dtq<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vx var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dtp.b<T> var1);

   dtp<T> e();

   dtq.a<T> a(jc<T> var1, dtp.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dtq<T>> {
      DataResult<C> read(jc<T> var1, dtp.d var2, dtq.a<T> var3);
   }
}
