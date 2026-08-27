import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asi extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   ato<InputStream> a(String... var1);

   @Nullable
   ato<InputStream> a(ask var1, akm var2);

   void a(ask var1, String var2, String var3, asi.a var4);

   Set<String> a(ask var1);

   @Nullable
   <T> T a(asv<T> var1) throws IOException;

   ash a();

   default String b() {
      return this.a().a();
   }

   default Optional<atd> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akm, ato<InputStream>> {
   }
}
