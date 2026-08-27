import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface dsw<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(vu var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(dsv.b<T> var1);

   dsv<T> e();

   dsw.a<T> a(jb<T> var1, dsv.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends dsw<T>> {
      DataResult<C> read(jb<T> var1, dsv.d var2, dsw.a<T> var3);
   }
}
