import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asa extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atg<InputStream> a(String... var1);

   @Nullable
   atg<InputStream> a(asc var1, akf var2);

   void a(asc var1, String var2, String var3, asa.a var4);

   Set<String> a(asc var1);

   @Nullable
   <T> T a(asn<T> var1) throws IOException;

   arz a();

   default String b() {
      return this.a().a();
   }

   default Optional<asv> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akf, atg<InputStream>> {
   }
}
