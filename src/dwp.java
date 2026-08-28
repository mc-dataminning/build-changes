import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dwp<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(wa var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dwo.b<T> var1);

   dwo<T> d();

   dwo<T> e();

   dwp.a<T> a(js<T> var1, dwo.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dwp<T>> {
      DataResult<C> read(js<T> var1, dwo.d var2, dwp.a<T> var3);
   }
}
