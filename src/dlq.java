import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dlq<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(ug var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dlp.b<T> var1);

   dlp<T> e();

   dlq.a<T> a(im<T> var1, dlp.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dlq<T>> {
      DataResult<C> read(im<T> var1, dlp.d var2, dlq.a<T> var3);
   }
}
