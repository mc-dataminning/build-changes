import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dxy<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(wf var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dxx.b<T> var1);

   dxx<T> d();

   dxx<T> e();

   dxy.a<T> a(jv<T> var1, dxx.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dxy<T>> {
      DataResult<C> read(jv<T> var1, dxx.d var2, dxy.a<T> var3);
   }
}
