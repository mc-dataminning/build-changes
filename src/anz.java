import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface anz extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   apd<InputStream> a(String... var1);

   @Nullable
   apd<InputStream> a(aoa var1, agm var2);

   void a(aoa var1, String var2, String var3, anz.a var4);

   Set<String> a(aoa var1);

   @Nullable
   <T> T a(aol<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<agm, apd<InputStream>> {
   }
}
