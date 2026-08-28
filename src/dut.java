import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dut<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(wm var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dus.b<T> var1);

   dus<T> e();

   dut.a<T> a(jn<T> var1, dus.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dut<T>> {
      DataResult<C> read(jn<T> var1, dus.d var2, dut.a<T> var3);
   }
}
