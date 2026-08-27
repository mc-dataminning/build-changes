import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dlx<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(ui var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dlw.b<T> var1);

   dlw<T> e();

   dlx.a<T> a(im<T> var1, dlw.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dlx<T>> {
      DataResult<C> read(im<T> var1, dlw.d var2, dlx.a<T> var3);
   }
}
