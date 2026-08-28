import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface aua extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   avg<InputStream> a(String... var1);

   @Nullable
   avg<InputStream> a(auc var1, alr var2);

   void a(auc var1, String var2, String var3, aua.a var4);

   Set<String> a(auc var1);

   @Nullable
   <T> T a(aun<T> var1) throws IOException;

   atz a();

   default String b() {
      return this.a().a();
   }

   default Optional<auu> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<alr, avg<InputStream>> {
   }
}
