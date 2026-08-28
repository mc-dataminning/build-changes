import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ath extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   aun<InputStream> a(String... var1);

   @Nullable
   aun<InputStream> a(atj var1, ale var2);

   void a(atj var1, String var2, String var3, ath.a var4);

   Set<String> a(atj var1);

   @Nullable
   <T> T a(atu<T> var1) throws IOException;

   atg a();

   default String b() {
      return this.a().a();
   }

   default Optional<auc> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ale, aun<InputStream>> {
   }
}
