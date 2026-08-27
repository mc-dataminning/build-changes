import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dro<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vg var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(drn.b<T> var1);

   drn<T> e();

   dro.a<T> a(iq<T> var1, drn.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dro<T>> {
      DataResult<C> read(iq<T> var1, drn.d var2, dro.a<T> var3);
   }
}
