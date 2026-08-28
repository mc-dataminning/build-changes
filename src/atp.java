import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface atp extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   auu<InputStream> a(String... var1);

   @Nullable
   auu<InputStream> a(atr var1, alg var2);

   void a(atr var1, String var2, String var3, atp.a var4);

   Set<String> a(atr var1);

   @Nullable
   <T> T a(auc<T> var1) throws IOException;

   ato a();

   default String b() {
      return this.a().a();
   }

   default Optional<auj> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alg, auu<InputStream>> {
   }
}
