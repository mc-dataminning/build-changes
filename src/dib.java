import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dib<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(sq var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dia.b<T> var1);

   dia<T> e();

   dib.a<T> a(hl<T> var1, dia.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dib<T>> {
      DataResult<C> read(hl<T> var1, dia.d var2, dib.a<T> var3);
   }
}
