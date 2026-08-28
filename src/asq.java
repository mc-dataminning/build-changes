import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface asq extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   atw<InputStream> a(String... var1);

   @Nullable
   atw<InputStream> a(ass var1, akr var2);

   void a(ass var1, String var2, String var3, asq.a var4);

   Set<String> a(ass var1);

   @Nullable
   <T> T a(atd<T> var1) throws IOException;

   asp a();

   default String b() {
      return this.a().a();
   }

   default Optional<atl> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<akr, atw<InputStream>> {
   }
}
