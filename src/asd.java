import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asd extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atj<InputStream> a(String... var1);

   @Nullable
   atj<InputStream> a(asf var1, akh var2);

   void a(asf var1, String var2, String var3, asd.a var4);

   Set<String> a(asf var1);

   @Nullable
   <T> T a(asq<T> var1) throws IOException;

   asc a();

   default String b() {
      return this.a().a();
   }

   default Optional<asy> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akh, atj<InputStream>> {
   }
}
