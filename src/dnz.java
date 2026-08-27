import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dnz<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(uq var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dny.b<T> var1);

   dny<T> e();

   dnz.a<T> a(io<T> var1, dny.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dnz<T>> {
      DataResult<C> read(io<T> var1, dny.d var2, dnz.a<T> var3);
   }
}
