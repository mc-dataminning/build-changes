import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ami extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   anm<InputStream> a(String... var1);

   @Nullable
   anm<InputStream> a(amj var1, aex var2);

   void a(amj var1, String var2, String var3, ami.a var4);

   Set<String> a(amj var1);

   @Nullable
   <T> T a(amu<T> var1) throws IOException;

   String a();

   default boolean b() {
      return false;
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<aex, anm<InputStream>> {
   }
}
